# Desafio 86

Trabalhando com filas usando a interface Queue

## Resultado

```java
import java.util.Queue;
import java.util.LinkedList;

public class Day086 {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Primeiro");
        fila.add("Segundo");
        fila.add("Terceiro");
        System.out.println("Fila: " + fila);
    }
}
```