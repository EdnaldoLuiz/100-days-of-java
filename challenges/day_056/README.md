# Desafio 56

Converter uma String em uma lista de Long

## Resultado

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day056 {

      public static void main(String[] args) {
            String numeros = "1,2,3,4,5";

            List<Long> list = Arrays.stream(numeros.split(","))
                        .map(Long::valueOf)
                        .collect(Collectors.toList());

            System.out.println(list);
      }
}
```