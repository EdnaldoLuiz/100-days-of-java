package challenges.day_097;

import java.util.concurrent.atomic.AtomicReference;

public class Day097 {

    public static void main(String[] args) {
        String referenciaInicial = "valor inicial";
        AtomicReference<String> stringAtomica = new AtomicReference<>(referenciaInicial);

        String novaReferencia = "novo valor";
        boolean trocado = stringAtomica.compareAndSet(referenciaInicial, novaReferencia);
        System.out.println("Trocado: " + trocado + ", Valor: " + stringAtomica.get());

        trocado = stringAtomica.compareAndSet(referenciaInicial, novaReferencia);
        System.out.println("Trocado: " + trocado + ", Valor: " + stringAtomica.get());
    }
}