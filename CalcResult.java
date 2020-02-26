package com.company;

public class CalcResult {

    private final int result;
    private final boolean success;
    private final int system;


    public  CalcResult (int result, boolean success, int system) {
        this.result = result;
        this.success = success;
        this.system = system;
    }


    public int getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public int whichSystemPrint() {
        return system;
    }

}
