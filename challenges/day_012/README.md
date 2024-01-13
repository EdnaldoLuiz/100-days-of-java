# Desafio 12

Utilizando Callable e Future para executar tarefas em paralelo

## Resultado

```java
public class Day012 {

    public static void main(String[] args) {
       ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<String>> futures = new ArrayList<>();

        Callable<String> task1 = () -> {
            Thread.sleep(2000);
            return "Tarefa 1 concluída";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(1000);
            return "Tarefa 2 concluída";
        };

        futures.add(executorService.submit(task1));
        futures.add(executorService.submit(task2));

        for (Future<String> future : futures) {
            try {
                String resultado = future.get();
                System.out.println(resultado);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
```