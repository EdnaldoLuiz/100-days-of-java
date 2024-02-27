# Desafio 58

Utilizando um Predicate

## Resultado

```java
import java.util.function.Predicate;

public class Day058 {

      public static void main(String[] args) {
            Predicate<Integer> isEven = number -> number % 2 == 0;

            System.out.println(isEven.test(4));
            System.out.println(isEven.test(5));
      }
}
```