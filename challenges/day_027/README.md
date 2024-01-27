# Desafio 27

Criando uma String a partir de uma Lista: um item por linha

## Resultado

```java
import java.util.Arrays;
import java.util.List;

public class Day027 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");

        String result = String.join("\n", list);
    }
}
```