package challenges.day_069;

import java.util.Arrays;
import java.util.List;

public class Day069 {
    public static void main(String args[]) {
        List<String> palavras = Arrays.asList("Lambda", "Method", "Reference");

        palavras.forEach(palavra -> System.out.println(palavra));

        palavras.forEach(System.out::println);
    }
}