package challenges.day_020;

import java.awt.GraphicsEnvironment;

public class Day020 {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}