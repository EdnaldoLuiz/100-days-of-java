# Desafio 41

Crie uma unmodifiableList usando Collections

## Resultado

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Day041 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        System.out.println(unmodifiableList);

        unmodifiableList.add("d");
    }
}
```