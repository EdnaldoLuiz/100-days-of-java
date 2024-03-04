# Desafio 64

Transforme uma variavel em todos os tipos de wrappers que herdam de Number

## Resultado

```java
public class Day064 {
    public static void main(String[] args) {

        Number number = 10;

        Integer integerObj = number.intValue();
        System.out.println("Integer: " + integerObj);

        Double doubleObj = number.doubleValue();
        System.out.println("Double: " + doubleObj);

        Float floatObj = number.floatValue();
        System.out.println("Float: " + floatObj);

        Long longObj = number.longValue();
        System.out.println("Long: " + longObj);

        Short shortObj = number.shortValue();
        System.out.println("Short: " + shortObj);

        Byte byteObj = number.byteValue();
        System.out.println("Byte: " + byteObj);
    }
}
```