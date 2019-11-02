package design.pattern.template2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverageTemplate {
    @Override
    protected void add() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void pour() {
        System.out.println("Pouring coffee in cup");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing coffee in boiling water");
    }

    @Override
    public boolean customerWantsCondiments() {
        String wantsCoffee = getUserInput();

        return wantsCoffee.equalsIgnoreCase("yes");
    }

    private String getUserInput() {
        String answer = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Would you like milk and sugar? (yes/no)");

        try {
            answer = br.readLine();
        } catch (IOException e) {
            System.err.println("ERROR: unable to read your answer");
        }

        return answer;
    }
}
