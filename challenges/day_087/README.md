# Desafio 87

Utilizando a classe Stack para criar uma pilha

## Resultado

```java
import java.util.Stack;

public class Day087 {

    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");
        System.out.println("Pilha: " + pilha);
    }
}
```