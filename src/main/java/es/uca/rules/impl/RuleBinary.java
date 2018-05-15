package es.uca.rules.impl;

import es.uca.rules.Rule;

public class RuleBinary implements Rule {

    private int[] ruleset = new int[]{0,1,0,1,1,0,1,0};

    @Override
    public Integer apply(Integer a, Integer b, Integer c) {
        String s = "" + a + b + c;
        int index = Integer.parseInt(s,2);
        return ruleset[index];
    }

}
