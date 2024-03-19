# Desafio 79

Trabalhando com LocalDate e LocalTime

## Resultado

```java
import java.time.LocalDate;
import java.time.LocalTime;

public class Day079 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Data atual: " + date);
        System.out.println("Hora atual: " + time);
    }
}
```