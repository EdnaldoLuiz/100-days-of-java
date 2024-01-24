# Desafio 23

Transformar um array de Enum em um array de String

## Resultado

```java
import java.util.Arrays;

public class Day023 {
    public static void main(String[] args) {
        String[] cores = Arrays.stream(Cores.values()).map(Cores::toString).toArray(String[]::new);

        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}

enum Cores {
    VERMELHO, VERDE, AZUL, AMARELO, BRANCO, PRETO
}
```