package challenges.day_073;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Day073 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Task Completeda";
        });

        try {
            System.out.println(future.get()); 
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
public class Day073 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Task Completeda";
        });

        try {
            System.out.println(future.get()); 
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}