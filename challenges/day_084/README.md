# Desafio 84

Trabalhando com expressões regulares e a classe Pattern

## Resultado

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day084 {

    public static void main(String[] args) {
        Pattern padrao = Pattern.compile("[a-z]+");
        Matcher correspondente = padrao.matcher("ola");
        boolean corresponde = correspondente.matches();
        System.out.println("A string corresponde ao regex dado? " + corresponde);
    }
}
```