# Desafio 46

Utilizando Function para mapear uma Lista de um tipo para outro

## Resultado

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Day046 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, String> intToString = Object::toString;

        List<String> stringNumbers = numbers.stream()
                                             .map(intToString)
                                             .collect(Collectors.toList());

        System.out.println(stringNumbers);
    }
}
```