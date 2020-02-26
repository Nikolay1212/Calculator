package com.company;

import java.util.*;

public class RomanCalc implements Calculator {

    @Override
    public CalcResult calculate(ArrayList<String> input) {

        List<CalcResult> calcResults = new ArrayList<>();


        int num1 = 0;
        int num2 = 0;
        int countNum = 0;

        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int[] arabian = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < roman.length; i++) {
            String c = input.get(1);
            String romanNum = roman[i];
            if(c.equals(romanNum)) {
                num1 = Integer.valueOf(arabian[i]); countNum++; break;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            String c = input.get(2);
            String romanNum = roman[i];
            if(c.equals(romanNum)) {
                num2 = Integer.valueOf(arabian[i]); countNum++; break;
            }
        }
        String operation = input.get(0);

        int result = 0;

        switch (operation) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;

        }

        if(countNum==2) {
        return new CalcResult(result, true, 5);
        }
        else return new CalcResult(0, false, 0);


    }
}
