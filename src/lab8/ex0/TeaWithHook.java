package lab8.ex0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeinBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Stepping with tea");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding milk and ice");
    }

    @Override
    boolean customerWantCondiment() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else
            return false;
    }

    String getUserInput() {
        String answer = null;
        System.out.println("would you like milk and ice with your Tea");
        BufferedReader inAnswer = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = inAnswer.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
