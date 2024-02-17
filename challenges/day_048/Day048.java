package challenges.day_048;

import java.util.function.Function;

public class Day048 {
    public static void main(String[] args) {
        Function<Integer, Integer> identityFunction = Function.identity();

        int result = identityFunction.apply(5);
        System.out.println(result); 
    }
}