package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static com.company.RomanNums.*;

public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        String string = input.getInput();

        Parser parser = new Parser();
        ArrayList<String> actionCollection = parser.getArrayList(string);

        Collection<Calculator> calculators = Arrays.asList(new ArabCalc(), new RomanCalc());

        CalcResult calcResult = calculators
                .stream()
                .map(c-> c.calculate(actionCollection))
                .filter(CalcResult::isSuccess)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Cannot calculate"));

        int result = calcResult.getResult();

        int system = calcResult.whichSystemPrint();

        if(system == 10) {
            System.out.println("Output: " + result);
        }
        else if(system == 5) {
            System.out.println("Output: " + arabicToRoman(result));
        }

    }
}
