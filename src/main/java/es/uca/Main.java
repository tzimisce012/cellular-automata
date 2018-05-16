package es.uca;

import es.uca.rules.Rule;
import es.uca.rules.RuleFactory;
import es.uca.util.Printer;

public class Main {

  public static void main(String[] args) {

    int size = 99;
    int numberOfIterations = 48;

    int[] cells = new int[size];
    int[][] result = new int[numberOfIterations][numberOfIterations];

    for (int i = 0; i < cells.length; i++) {
      cells[i] = 0;
    }
    cells[cells.length / 2] = 1;

    result[0] = cells;

    Rule rule = RuleFactory.getRule("Rule 30");
    CellularAutomata cellularAutomata = new CellularAutomata(cells, rule);

    for (int i = 1; i < numberOfIterations; i++) {
      cellularAutomata.generate();
      result[i] = cellularAutomata.getCells();
    }

    Printer.printCells(result);

  }

}
