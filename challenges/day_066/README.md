# Desafio 66

Criando uma Function genérica

## Resultado

```java
import java.util.function.Function;

public class Day066 {
    public static void main(String args[]) {
        Function<Object, String> function = obj -> obj.toString();

        String resultado = function.apply(123);
        System.out.println(resultado);
    }
}
```