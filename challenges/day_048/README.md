# Desafio 48

Criando uma função que sempre retorna seu argumento de entrada. 

## Resultado

```java
import java.util.function.Function;

public class Day048 {
    public static void main(String[] args) {
        Function<Integer, Integer> identityFunction = Function.identity();

        int result = identityFunction.apply(5);
        System.out.println(result); 
    }
}
```