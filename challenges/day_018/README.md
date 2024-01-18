# Desafio 18

Encontrando o valor máximo de uma Coleção

## Resultado

```java
import java.util.Collections;
import java.util.List;

public class Day018 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 9, 5);

        int max = Collections.max(numeros);
        System.out.println("Max: " + max);
    }  
}
```