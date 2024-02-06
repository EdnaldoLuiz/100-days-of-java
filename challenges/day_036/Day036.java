package challenges.day_036;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Day036 {
    public static void main(String[] args) {
        String nullString = null;
        String nonNullString = "Hello, world!";

        String result1 = Objects.requireNonNullElse(nullString, "Default value");
        System.out.println(result1);

        String result2 = Objects.requireNonNullElse(nonNullString, "Default value");
        System.out.println(result2);
    }
}
