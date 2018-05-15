package es.uca.rules;

import es.uca.rules.impl.Rule30;
import es.uca.rules.impl.Rule45;
import es.uca.rules.impl.RuleBinary;

public class RuleFactory {

  public static Rule getRule(String rule) {

    switch (rule) {
      case "Rule 30":
        return new Rule30();

      case "Rule 45":
        return new Rule45();

      default:
        return new RuleBinary();
    }
  }
}
