package challenges.day_092;

public class Day092 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello World!");

        System.out.println("String original: " + sb.toString());

        sb.reverse();
        System.out.println("String invertida: " + sb.toString());

        sb.reverse();

        sb.delete(0, 6);
        System.out.println("String após remoção: " + sb.toString());
    }
}