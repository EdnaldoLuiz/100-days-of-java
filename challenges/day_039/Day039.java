package challenges.day_039;

import java.util.concurrent.*;

public class Day039 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Resultado da tarefa longa";
        }, executor);

        String result;
        try {
            result = future.get(2, TimeUnit.SECONDS); 
        } catch (TimeoutException e) {
            result = "Valor padrão devido ao timeout";
        } catch (InterruptedException | ExecutionException e) {
            result = "Erro ao executar a tarefa";
        }

        System.out.println(result);

        executor.shutdown();
    }
}
