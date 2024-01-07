# Desafio 7

Formatando uma mensagem usando MessageFormat

## Resultado

```java
import java.text.MessageFormat;

public class Day007 {

    public static void main(String[] args) {
        String profissao = "Desenvolvedor Full-Stack";
        String nome = "Ednaldo Luiz";
        int idade = 21;

        String message = MessageFormat.format("Me chamo {0} e sou um {1} de {2} anos", nome, profissao, idade);

        System.out.println(message);
    }
}
```