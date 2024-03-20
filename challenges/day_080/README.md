# Desafio 80

Manipulando arquivos com a classe File

## Resultado

```java
import java.io.File;
import java.io.IOException;

public class Day080 {

    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erroooooooo!");
            e.printStackTrace();
        }
    }
}
```