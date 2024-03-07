package challenges.day_067;

public class Day067 {
    public static void main(String args[]) {
        Soma soma = (a, b) -> a + b;

        int resultado = soma.somar(5, 3);
        System.out.println(resultado);
    }
}

public interface Soma {
    int somar(int a, int b);
}