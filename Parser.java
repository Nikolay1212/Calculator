package com.company;

import java.util.ArrayList;

public class Parser {



    public ArrayList<String> getArrayList(String input) {

        ArrayList<String> actionCollection = new ArrayList<>();

        String num1 = "";
        String num2 = "";
        String operator = "";



        int indexOfAction = 0;
        int countOfAction = 0;

        for (int i = 1; i < input.length()-2; i++) {
            String c = input.substring(i, i + 3);
            char o = input.charAt(i+1);

            if (c.equals(" + ")  || c.equals(" - ") || c.equals(" * ") || c.equals(" / ")) {

                countOfAction++;
                indexOfAction = indexOfAction + i + 1;
                operator = operator + o;
            }
            else {
                continue;
            }

        }
        actionCollection.add(operator);


        if (countOfAction == 1) {

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (Character.isDigit(c)) {
                    num1 = num1 + c;
                }
                else if (Character.isLetter(c)) {
                    num1 = num1 + c;
                }
                else {
                    break;
                }

            }
            actionCollection.add(num1);
        }


        for (int i = indexOfAction + 2; i < input.length(); i++) {

            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                num2 = num2 + c;
            }
            else if (Character.isLetter(c)) {
                num2 = num2 + c;
            }
            else {
                break;

            }

        }

        actionCollection.add(num2);

        return actionCollection;
    }
}
