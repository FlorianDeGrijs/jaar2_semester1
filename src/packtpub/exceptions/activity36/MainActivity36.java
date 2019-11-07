package packtpub.exceptions.activity36;

import java.util.Scanner;

public class MainActivity36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1, num2, num3;
        int total;

        boolean done = false;
        while (!done) {
            System.out.println("Enter number 1: ");
            num1 = input.nextLine();
            System.out.println("Enter number 2: ");
            num2 = input.nextLine();
            System.out.println("Enter number 3: ");
            num3 = input.nextLine();

            try {
                total = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
                done = true;
                System.out.println("The total is: " + total);
            } catch (NumberFormatException e) {
                System.out.println("Enter whole numbers only");
            }
        }
    }
}
