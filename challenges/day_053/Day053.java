package challenges.day_053;

class ObjetoCaro {
    public ObjetoCaro() {
        System.out.println("Criando ObjetoCaro...");
    }
}

public class Day053 {
    public static void main(String[] args) {
        Supplier<ObjetoCaro> fornecedor = ObjetoCaro::new;

        System.out.println("Antes de chamar get() no Fornecedor...");

        ObjetoCaro objetoCaro = fornecedor.get();

        System.out.println("Depois de chamar get() no Fornecedor...");
    }
}