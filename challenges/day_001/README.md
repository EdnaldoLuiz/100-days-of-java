# Desafio 1

Gerando um número aleatório dentro de uma faixa específica

## Resultado

```java
public class Day001 {

    public static void main(String[] args) {
        System.out.println(getRandomNumber(10, 100));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
```