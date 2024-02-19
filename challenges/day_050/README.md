# Desafio 50

Criando um Stream a partir de um intervalo de Integers

## Resultado

```java
import java.util.stream.IntStream;

public class Day050 {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::println);
    }
}
```