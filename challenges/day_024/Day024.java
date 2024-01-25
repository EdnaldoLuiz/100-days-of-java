package challenges.day_024;

public class Day024 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long antes = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada antes de criar a String: " + antes);

        new String(new char[100000000]);

        long depois = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memory usada depois de criar a String: " + depois);

        System.out.println("Memoria aumentada: " + (depois - antes));
    }
}