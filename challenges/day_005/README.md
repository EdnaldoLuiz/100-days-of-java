# Desafio 5

Criando uma lista com itens filtrados de outras listas.

## Resultado

```java
import java.util.List;

public class Day005 {

    public static void main(String[] args) {
        List<String> nomes = List.of("João", "Maria", "Luiz", "José", "Joana", "Lúcia");
        System.out.println("Nomes: " + nomes);

        List<String> nomesFiltrados = nomes.stream().filter(nome -> nome.startsWith("J")).toList();
        System.out.println("Nomes que começam com J: " + nomesFiltrados);
    }
}
```