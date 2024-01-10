package challenges.day_009;

public class Day009 {

    public static void main(String[] args) {
        System.out.println("O valor do enum 1 é: " + Values.UM.getValor());
        System.out.println("O valor do enum 2 é: " + Values.DOIS.getValor());
        System.out.println("O valor do enum 3 é: " + Values.TRES.getValor());
    }
}

enum Values {

    UM(1), 
    DOIS(2), 
    TRES(3);

    private int valor;

    Values(int valores) {
        this.valor = valores;
    }

    public int getValor() {
        return valor;
    }
}