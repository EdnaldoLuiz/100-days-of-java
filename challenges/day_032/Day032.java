package challenges.day_032;

import java.util.Optional;

public class Day032 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        try {
            String value = optional.orElseThrow(() -> new IllegalArgumentException("Optional esta vazio"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
