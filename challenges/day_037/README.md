# Desafio 37

Compreendendo os Operadores de Prefixo (i) e Sufixo (i).

## Resultado

```java
public class Day037 {
    public static void main(String[] args) {
        int i = 5;

        // Operador de prefixo
        System.out.println(++i);  // Imprime: 6
        System.out.println(i);    // Imprime: 6

        i = 5;

        // Operador de sufixo
        System.out.println(i++);  // Imprime: 5
        System.out.println(i);    // Imprime: 6
    }
}
```