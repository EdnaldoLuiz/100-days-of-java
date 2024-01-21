# Desafio 21

Mapeando e reduzindo de uma Lista

## Resultado

```java

import java.util.Arrays;
import java.util.List;

public class Day021 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sumOfSquares);
    }
}
```