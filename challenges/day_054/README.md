# Desafio 54

Computando valores de um Map se ausentes

## Resultado

```java
import java.util.HashMap;
import java.util.Map;

public class Day054 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 1);

        map.computeIfAbsent("key2", key -> 2);

        map.computeIfAbsent("key1", key -> 3);

        System.out.println(map);
    }
}
```