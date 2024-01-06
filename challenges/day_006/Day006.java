package challenges.day_006;

import java.util.concurrent.CompletableFuture;

public class Day006 {

    private static void sync() {
        System.out.println("1 - Sou síncrono, vou primeiro!");
    }

    private static void assync() {
        System.out.println("2 - Sou assíncrono, vou depois do 1...");
    }

    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> {
            assync();
        });

        sync();
    }
}