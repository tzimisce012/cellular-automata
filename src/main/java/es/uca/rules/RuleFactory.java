package es.uca.rules;

import es.uca.rules.impl.Rule30;
import es.uca.rules.impl.RuleBinary;

public class RuleFactory {

    public static Rule getRule(String rule) {

        switch (rule) {
            case "Rule 30":
                return new Rule30();

            default:
                return new RuleBinary();
        }
    }
}
