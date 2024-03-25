# Desafio 85

Criando e manipulando conjuntos com a classe Set

## Resultado

```java
import java.util.Set;
import java.util.HashSet;

public class Day085 {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Cereja");
        System.out.println("Conjunto: " + conjunto);
    }
}
```