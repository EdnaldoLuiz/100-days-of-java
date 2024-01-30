# Desafio 26

Utilizando Optional quando null é um valor de retorno válido

## Resultado

```java
import java.util.Optional;

public class Day026 {
    public static void main(String[] args) {
        String nullableString = getNullableString();

        Optional<String> optionalString = Optional.ofNullable(nullableString);

        if (optionalString.isPresent()) {
            System.out.println("Essa String é : " + optionalString.get());
        } else {
            System.out.println("Essa String é nula");
        }
    }

    public static String getNullableString() {
        return Math.random() > 0.5 ? "Hello, world!" : null;
    }
}
```