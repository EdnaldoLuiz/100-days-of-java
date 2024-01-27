package challenges.day_027;

import java.util.Arrays;
import java.util.List;

public class Day027 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");

        String result = String.join("\n", list);
        System.out.println(result);
    }
}
