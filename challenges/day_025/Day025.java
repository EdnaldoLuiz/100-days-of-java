package challenges.day_025;

public class Day025 {
    public static void main(String[] args) {
        Object obj = "Hello, world!";

        if (obj instanceof String string) {
            System.out.println("Tamanho da String: " + string.length());
        } else {
            System.out.println("Não é uma String");
        }
    }
}