# Desafio 17

Nunca passe um double como argumento ao construir objetos BigDecimal

## Resultado

```java
import java.math.BigDecimal;

public class Day017 {
    public static void main(String[] args) {
        // Nunca use, o resultado sera: 1.229999999999999982236431605997495353221893310546875
        System.out.println(new BigDecimal(1.23));

        // Use dessa forma: imprime 1.23
        System.out.println(new BigDecimal("1.23"));

        // Ou dessa forma: imprime 1.23
        System.out.println(BigDecimal.valueOf(1.23));
    }
}
```