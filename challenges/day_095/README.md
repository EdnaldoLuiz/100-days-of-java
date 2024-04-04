# Desafio 95

Utilizando a classe BigDecimal para números decimais de precisão arbitrária

## Resultado

```java
import java.math.BigDecimal;

public class Day095 {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.123456789");
        BigDecimal num2 = new BigDecimal("20.987654321");

        BigDecimal sum = num1.add(num2);
        System.out.println("Soma: " + sum);

        BigDecimal difference = num1.subtract(num2);
        System.out.println("Diferença: " + difference);

        BigDecimal product = num1.multiply(num2);
        System.out.println("Produto: " + product);

        BigDecimal quotient = num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Quociente: " + quotient);
    }
}
```