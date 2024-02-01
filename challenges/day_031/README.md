# Desafio 31

Utilizando switch para retornar um valor.

## Resultado

```java
import java.util.List;
import java.util.stream.Stream;

public class Day031 {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(1));
        System.out.println(getDayOfWeek(5));
    }

    public static String getDayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido";
        };
    }
}
```