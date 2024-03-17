# Desafio 77

Sempre fazer o cast dos operandos Math antes da atribuição

## Resultado

```java
import java.util.Arrays;
import java.util.List;

public class Day077 {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 3.5;
        int resultado;

        resultado = (int) (a / b);

        System.out.println(resultado);
    }
}
```