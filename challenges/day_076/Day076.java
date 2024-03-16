package challenges.day_076;

import java.util.Arrays;
import java.util.List;

public class Day076 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        int soma = lista.stream().mapToInt(Integer::intValue).sum();

        System.out.println(soma); 
    }
}