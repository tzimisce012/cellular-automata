package es.uca.rules.impl;

import es.uca.rules.Rule;

public class Rule30 implements Rule {

    @Override
    public Integer apply(Integer a, Integer b, Integer c) {
        String s = "" + a + b + c;
        int newCell;
        switch (s){
            case "111":
                newCell = 0;
                break;

            case "110":
                newCell = 0;
                break;

            case "101":
                newCell = 0;
                break;

            case "100":
                newCell = 1;
                break;

            case "011":
                newCell = 1;
                break;

            case "010":
                newCell = 1;
                break;

            case "001":
                newCell = 1;
                break;

            case "000":
                newCell = 0;
                break;

            default:
                throw new IllegalArgumentException("This combination of states is not allowed");
        }
        return newCell;
    }
}