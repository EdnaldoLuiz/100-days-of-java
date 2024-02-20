package challenges.day_051;

import java.util.function.UnaryOperator;

public class Day051 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}