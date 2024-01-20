package challenges.day_019;

import java.util.LinkedHashMap;
import java.util.Map;

public class Day019 {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "tres");
        map.put(4, "quatro");

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}