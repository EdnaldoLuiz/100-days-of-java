# Desafio 14

Dividindo Strings.

## Resultado

```java
public class Day014 {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String[] parts = str.split(", ");

        for (String part : parts) {
            System.out.println("Separei: " + part);
        }
    }      
}     
```