package es.uca;

import es.uca.rules.Rule;

public class CellularAutomata {

    private int[] cells;
    private Rule rule;

    public CellularAutomata(int[] initialCells, Rule rule) {
        this.cells = initialCells;
        this.rule = rule;
    }

    public void generate() {
        int[] nextgen = new int[cells.length];
        for (int i = 1; i < cells.length-1; i++) {
            int left = cells[i-1];
            int center = cells[i];
            int right = cells[i+1];
            nextgen[i] = rule.apply(left, center, right);
        }
        cells = nextgen;
    }

    public int[] getCells() {
        return cells;
    }
}
