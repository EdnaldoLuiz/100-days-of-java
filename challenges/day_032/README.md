# Desafio 32

Começando a usar o Optional#orElseThrow em vez de Optional

## Resultado

```java
import java.util.Optional;

public class Day031 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        try {
            String value = optional.orElseThrow(() -> new IllegalArgumentException("Optional esta vazio"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```