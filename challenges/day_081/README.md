# Desafio 81

Lendo e escrevendo em arquivos com a classe Files

## Resultado

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Day081 {

    public static void main(String[] args) {
        String conteudo = "Hello, World!";
        try {
            Files.write(Paths.get("teste.txt"), conteudo.getBytes());
            System.out.println("Arquivo escrito com sucesso!");

            String conteudoLido = new String(Files.readAllBytes(Paths.get("teste.txt")));
            System.out.println("Conteúdo do arquivo: " + conteudoLido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```