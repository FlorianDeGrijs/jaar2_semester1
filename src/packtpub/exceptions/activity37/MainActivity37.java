package packtpub.exceptions.activity37;

import java.util.Scanner;

public class MainActivity37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        while (true) {
            System.out.println("Enter name of visitor: ");
            name = input.nextLine();
            if (name.length() == 0) {
                break;
            }
            try {
                System.out.println("Enter " + name + "'s age: ");
                int age = input.nextInt();
                input.nextLine();
                if (age < 15) {
                    throw new TooYoungException(age, name);
                }

                System.out.println("Enter " + name + "'s height");
                int height = input.nextInt();
                input.nextLine();
                if (height < 130) {
                    throw new TooShortException(height, name);
                }
                System.out.printf("%s is riding the coaster.\n", name);
            } catch (TooYoungException e) {
                System.out.printf("%s is %d years old and to young to ride the coaster\n", e.name, e.age);
            } catch (TooShortException e) {
                System.out.printf("%s is %d tall and to short to ride the coaster\n", e.name, e.height);
            } finally {
                System.out.println("Escorting " + name + " outside the premises.");
            }
        }

    }
}
