package es.uca;

import com.diogonunes.jcdp.color.api.Ansi;
import es.uca.rules.Rule;
import es.uca.rules.RuleFactory;
import es.uca.util.Printer;

public class Main {

    public static void main(String[] args) {

        int size = 95;
        int numberOfIterations = 95;

        int[] cells = new int[size];
        int[][] result = new int[size][numberOfIterations];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = 0;
        }
        cells[cells.length/2] = 1;

        result[0] = cells;

        Rule rule = RuleFactory.getRule("Rule 30");
        CellularAutomata cellularAutomata = new CellularAutomata(cells, rule);

        for (int i = 1; i < numberOfIterations; i++) {
            cellularAutomata.generate();
            result[i] = cellularAutomata.getCells();
        }

        for (int[] row : result) {
            for (int state : row) {
                if(state == 1)
                    Printer.print(state + " ", Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.BLACK);
                else
                    Printer.print(state + " ", Ansi.Attribute.REVERSE, Ansi.FColor.WHITE, Ansi.BColor.WHITE);
            }
            System.out.println();
        }

    }

}
