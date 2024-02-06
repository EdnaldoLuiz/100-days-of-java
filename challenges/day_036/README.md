# Desafio 36

Utilizando Objects.requireNonNullElse quando Optional não é uma opção

## Resultado

```java
import java.util.Objects;

public class Day036 {
    public static void main(String[] args) {
        String nullString = null;
        String nonNullString = "Hello, world!";

        String result1 = Objects.requireNonNullElse(nullString, "Default value");
        System.out.println(result1);

        String result2 = Objects.requireNonNullElse(nonNullString, "Default value");
        System.out.println(result2);
    }
}
```