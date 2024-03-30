package challenges.day_090;

import java.util.Random;

public class Day090 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(100);
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}