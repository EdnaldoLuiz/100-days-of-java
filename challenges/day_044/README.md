# Desafio 44

Formatando Strings com java.lang.String#formatted

## Resultado

```java
public class Day044 {
    public static void main(String[] args) {
        String nome = "John";
        int idade = 30;

        String formattedString = "Hello, my name is %s and I am %d years old.".formatted(nome, idade);
        System.out.println(formattedString);
    }
}
```