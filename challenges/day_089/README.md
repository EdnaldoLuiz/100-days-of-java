# Desafio 89

Criando e manipulando mapas com a classe TreeMap

## Resultado

```java
import java.util.TreeMap;

public class Day089 {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Chave1", "Valor1");
        map.put("Chave2", "Valor2");
        map.put("Chave3", "Valor3");
        System.out.println("Mapa: " + map);
    }
}
```