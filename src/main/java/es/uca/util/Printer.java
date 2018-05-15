package es.uca.util;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

public class Printer {

    private static ColoredPrinter coloredPrinter;

    static  {
        coloredPrinter = new ColoredPrinter.Builder(1, false)
                .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.WHITE)   //setting format
                .build();
    }

    public static void print(String text, Ansi.Attribute attribute, Ansi.FColor frontColor, Ansi.BColor backColor) {
        coloredPrinter.print(text, attribute, frontColor, backColor);
    }
}
