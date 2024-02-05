# Desafio 35

Recursos de autoclosing (try-with-resources)

## Resultado

```java
import java.io.IOException;
import java.io.InputStreamReader;

public class Day035 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```