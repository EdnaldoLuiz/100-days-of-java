# Desafio 93

Utilizando a classe Math para realizar operações matemáticas

## Resultado

```java
public class Day093 {

    public static void main(String[] args) {
        double numero1 = 25.0;
        double numero2 = 7.0;

        double raizQuadrada = Math.sqrt(numero1);
        System.out.println("A raiz quadrada de " + numero1 + " é: " + raizQuadrada);

        double potencia = Math.pow(numero1, numero2);
        System.out.println(numero1 + " elevado à potência de " + numero2 + " é: " + potencia);

        double maximo = Math.max(numero1, numero2);
        System.out.println("O máximo entre " + numero1 + " e " + numero2 + " é: " + maximo);

        double minimo = Math.min(numero1, numero2);
        System.out.println("O mínimo entre " + numero1 + " e " + numero2 + " é: " + minimo);

        double absoluto = Math.abs(-10);
        System.out.println("O valor absoluto de -10 é: " + absoluto);
    }
}
```