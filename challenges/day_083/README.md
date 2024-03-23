# Desafio 83

Utilizando a classe Scanner para ler entrada do usuário

## Resultado

```java
import java.util.Scanner;

public class Day083 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        scanner.close();
    }
}
```