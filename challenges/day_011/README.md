# Desafio 11

Invertendo uma String

## Resultado

```java
public class Day011 {

    public static void main(String[] args) {
        String normal = "Hello World";
        System.out.println(normal);

        String reverse = new StringBuilder(normal).reverse().toString();
        System.out.println(reverse);
    }
}
```