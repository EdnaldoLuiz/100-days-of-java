package challenges.day_040;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Day040 {
    public static void main(String[] args) {
         List<String> list = List.of("Maçã", "Banana", "Morango", "Uva", "Abacaxi");

        Predicate<String> comecaComM = s -> s.startsWith("M");

        List<String> resultado = list.stream()
                                  .filter(Predicate.not(comecaComM))
                                  .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
