# Desafio 60

Particionando um Stream por um Predicate

## Resultado

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day060 {

      public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            /**
             * O Predicate está sendo passado pela lambda na linha 21
             * <p>
             * Predicate<Integer> pares = n -> n % 2 == 0;
             * </p>
             */

            Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));

            System.out.println("Números pares: " + partitioned.get(true));
            System.out.println("Números ímpares: " + partitioned.get(false));
      }
}
```