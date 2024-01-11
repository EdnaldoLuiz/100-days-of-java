# Desafio 10

Ordenando um java.util.Map pelos seus valores

## Resultado

```java
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Day010 {

    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Alice", 30);
        pessoas.put("Bob", 20);
        pessoas.put("Charlie", 25);
        pessoas.put("David", 35);

        System.out.println("Conjunto de pessoas original: " + pessoas);

        Map<String, Integer> pessoasOrdenadas = pessoas.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("Pessoas ordenado por valores: " + pessoasOrdenadas);
    }
}
```