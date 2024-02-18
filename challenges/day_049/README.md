# Desafio 49

Não se repita: Reutilizando funções com Function

## Resultado

```java
import java.util.function.Function;

public class Day049 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        Function<Integer, Integer> addOne = number -> number + 1;

        Function<Integer, Integer> multiplyByTwoAndAddOne = multiplyByTwo.andThen(addOne);

        int result = multiplyByTwoAndAddOne.apply(5);
        System.out.println(result);
    }
}
```