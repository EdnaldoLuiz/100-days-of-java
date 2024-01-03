# Desafio 3

Removendo itens de uma lista

## Resultado

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day003 {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Elisa", "Carlos", "Carla", "Mariana"));
        nomes.removeIf(nome -> nome.startsWith("C"));
        nomes.forEach(System.out::println);
    }
}
```