package com.company;

import java.util.Scanner;

public class Input {


    public String getInput() {

        System.out.println("Input");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        return input;
    }
}
