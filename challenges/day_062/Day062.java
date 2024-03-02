package challenges.day_062;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Day062 {

      public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            Consumer<Integer> mostrarNumero = (Integer numero) -> System.out.println(numero);

            numeros.forEach(mostrarNumero);
      }  
}