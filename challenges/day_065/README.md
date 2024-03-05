# Desafio 65

Reduzindo a verbosidade de Generics com Diamond Operators

## Resultado

```java
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Day065 {
    public static void main(String args[]) {

        // Sem operador de diamante
        Map<String, List<String>> mapAntigo = new HashMap<String, List<String>>();
        
        // Com operador de diamante
        Map<String, List<String>> mapNovo = new HashMap<>();
    }
}
```