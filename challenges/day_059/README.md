# Desafio 59

Encadeando Predicates

## Resultado

```java
import java.util.function.Predicate;

public class Day059 {

      public static void main(String[] args) {
            Predicate<Integer> par = number -> number % 2 == 0;
            Predicate<Integer> maiorQue5 = number -> number > 5;

            Predicate<Integer> parMaiorQue5 = par.and(maiorQue5);

            int[] numbers = {2, 4, 6, 8, 10, 12, 14};

            for (int number : numbers) {
                  if (parMaiorQue5.test(number)) {
                        System.out.println(number);
                  }
            }
      }
}
```