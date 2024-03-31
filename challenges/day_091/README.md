# Desafio 91

Criando e manipulando listas com a classe LinkedList

## Resultado

```java
import java.util.LinkedList;
import java.util.List;

public class Day091 {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");

        lista.addFirst("Zero");
        lista.addLast("Quarto");

        lista.removeFirst();
        lista.removeLast();

        System.out.println("Primeiro elemento: " + lista.getFirst());
        System.out.println("Último elemento: " + lista.getLast());
        System.out.println("Lista: " + lista);
    }
}
```