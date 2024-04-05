# Desafio 96

Trabalhando com a classe AtomicInteger para operações atômicas em inteiros

## Resultado

```java
import java.util.concurrent.atomic.AtomicInteger;

public class Day096 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        int newValue = atomicInteger.incrementAndGet();
        System.out.println("Valor do AtomicInteger incrementado: " + newValue);

        newValue = atomicInteger.decrementAndGet();
        System.out.println("Valor do AtomicInteger decrementado: " + newValue);

        newValue = atomicInteger.addAndGet(5);
        System.out.println("Adicionado 5 ao AtomicInteger: " + newValue);

        atomicInteger.set(10);
        System.out.println("Novo valor definido para o AtomicInteger: " + atomicInteger.get());
    }
}
```