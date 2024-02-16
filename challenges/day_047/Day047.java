package challenges.day_047;

@FunctionalInterface
interface Hello {
    void escrever(String nome);
}

public class Day047 {
    public static void main(String[] args) {
        Hello hello = (nome) -> System.out.println("Hello, " + nome);
        hello.escrever("World");
    }
}