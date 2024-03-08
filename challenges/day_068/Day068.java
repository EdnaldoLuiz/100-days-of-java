package challenges.day_068;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day068 {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("a", "b", "c", "b", "b", "a");
        int freq = Collections.frequency(list, "b");
        System.out.println("A letra 'b' aparece: " + freq + " vezes");
    }
}