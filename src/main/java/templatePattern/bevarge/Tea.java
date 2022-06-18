package templatePattern.bevarge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("The Tea is brewing");
    }

    @Override
    void addCondiments() {
        System.out.println("Add the Lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) { // y로 시작되는 단어가 들어올 때
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요?(y/n)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("IO Error occur");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
