# Desafio 2

Formatando um objeto LocalDateTime

## Resultado

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day002 {

    private static final String DATE_PATTERN = "dd/MM/yyyy : HH:mm:ss";

    public static void main(String[] args) {
        var date = LocalDateTime.now();
        var formattedDate = date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
        System.out.println(formattedDate);
    }
}
```