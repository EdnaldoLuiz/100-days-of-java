# Desafio 78

Criando um array bidimensional

## Resultado

```java
public class Day078 {

    public static void main(String[] args) {
        int[][] bidimensionalArray = new int[5][5];

        for (int i = 0; i < bidimensionalArray.length; i++) {
            for (int j = 0; j < bidimensionalArray[i].length; j++) {
                bidimensionalArray[i][j] = i * j;
                System.out.print(bidimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```