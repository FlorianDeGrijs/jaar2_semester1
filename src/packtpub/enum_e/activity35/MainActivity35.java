package packtpub.enum_e.activity35;

import packtpub.enum_e.activity34.DeptEnum;

import java.util.Scanner;

public class MainActivity35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = null;

        System.out.println("Enter course name: ");
        answer = input.nextLine();

        boolean found = App.isFound(answer);

        print(answer, found);
    }

    private static void print(String answer, boolean found) {
        if (found) {
            System.out.println("Found course: " + DeptEnum.valueOf(answer.toUpperCase()).getAcronym() + ". ID: " + DeptEnum.valueOf(answer.toUpperCase()).getDeptNum());
        } else {
            System.out.println("Course " + answer + " not found.");
        }
    }
}

