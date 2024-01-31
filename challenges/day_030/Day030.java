package challenges.day_030;

import java.util.List;
import java.util.stream.Stream;

public class Day030 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        List<String> list = stream.toList();
        System.out.println(list);
    }
}
