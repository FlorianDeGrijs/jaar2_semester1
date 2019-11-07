package packtpub.exceptions.user_help;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUserHelp {

    private static List<Integer> parseIntegers(List<String> inputList) throws NonNumberInListException {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (String s : inputList) {
            try {
                list.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                throw new NonNumberInListException(index, e);
            }
            index++;
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("5");
        numbers.add("two");
        numbers.add("4");

        boolean done = false;
        while (!done) {
            try {
                List<Integer> intNumbers = parseIntegers(numbers);

                int total = 0;
                for (Integer i : intNumbers) {
                    total += i;
                }
                System.out.println("The total is: " + total);
                done = true;
            } catch (NonNumberInListException e) {
                System.out.println("The list contains a non numeric number " + numbers.get(e.index));
                System.out.println("Please enter a numeric whole number: ");
                Scanner input = new Scanner(System.in);
                String newValue = input.nextLine();
                numbers.set(e.index, newValue);
            }
        }
    }
}
