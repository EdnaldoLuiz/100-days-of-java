package challenges.day_066;

import java.util.function.Function;

public class Day066 {
    public static void main(String args[]) {
        Function<Object, String> function = obj -> obj.toString();

        String result = function.apply(123);
        System.out.println(result);
    }
}