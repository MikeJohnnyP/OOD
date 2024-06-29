package lab8.ex0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeinBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dropping coffee into blend");
        System.out.println("pouring coffee through the filter");
    }

    @Override
    void addCondiment() {
        System.out.println("adding sugar and pepper");
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
        System.out.println("would you like milk and peper with your coffee");
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
