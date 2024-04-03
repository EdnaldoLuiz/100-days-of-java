package challenges.day_094;

import java.math.BigInteger;

public class Day094 {

    public static void main(String[] args) {
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Soma: " + sum);

        BigInteger difference = bigInt1.subtract(bigInt2);
        System.out.println("Diferença: " + difference);

        BigInteger product = bigInt1.multiply(bigInt2);
        System.out.println("Produto: " + product);

        BigInteger quotient = bigInt1.divide(bigInt2);
        System.out.println("Quociente: " + quotient);
    }
}