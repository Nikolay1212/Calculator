package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArabCalc implements Calculator {

    @Override
    public CalcResult calculate(ArrayList<String> input) {

        int countNum = 0;

        List<Integer> nums = new ArrayList<>();

        try {
            nums.add(Integer.valueOf(input.get(1)));
        } catch (NumberFormatException e){
            return new CalcResult(0, false, 0);
        }
        try {
            nums.add(Integer.valueOf(input.get(2)));
        } catch (NumberFormatException e){
            return new CalcResult(0, false, 0);
        }


            int num1 = Integer.valueOf(input.get(1));
            int num2 = Integer.valueOf(input.get(2));
            String operation = input.get(0);
            int result = 0;

            switch (operation) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;

            }

        return new CalcResult(result, true, 10);
    }


}
