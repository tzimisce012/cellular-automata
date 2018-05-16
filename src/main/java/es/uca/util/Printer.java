package es.uca.util;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

public class Printer {

  private static ColoredPrinter coloredPrinter;

  static {
    coloredPrinter = new ColoredPrinter.Builder(1, false)
      .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.WHITE)   //setting format
      .build();
  }

  public static void printCells(int[][] cells) {
    for (int[] row : cells) {
      for (int state : row) {
        if (state == 1)
          coloredPrinter.print(state + " ", Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.BLACK);
        else
          coloredPrinter.print(state + " ", Ansi.Attribute.REVERSE, Ansi.FColor.WHITE, Ansi.BColor.WHITE);
      }
      System.out.println();
    }
  }

  private static void print(String text, Ansi.Attribute attribute, Ansi.FColor frontColor, Ansi.BColor backColor) {
    coloredPrinter.print(text, attribute, frontColor, backColor);
  }
}
