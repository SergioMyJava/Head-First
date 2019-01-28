package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew Coffee .");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk .");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) { // <--Леша объясни что тут происходит я теряюсь в обилии классов и
            return true;                            //Методов по которым тут прыгают ссылки и не понятно что каждый метод делает
        } else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(answer == null)
            return "no";
        else
            return answer;
    }
}
