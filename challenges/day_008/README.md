# Desafio 8

Criando um pool de threads para executar tarefas simultaneamente e reutilizar threads

## Resultado

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day008 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            int task = i;
            executor.submit(() -> {
                System.out.println("Executando task " + task + " na thread " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
```