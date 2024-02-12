# Desafio 43

Utilizando StringJoiner

## Resultado

```java
import java.util.StringJoiner;

public class Day043 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Hello");
        joiner.add("world");
        joiner.add("!");

        String result = joiner.toString();
        System.out.println(result);
    }
}
```