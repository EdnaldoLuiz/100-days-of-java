package challenges.day_052;

import java.io.FileReader;
import java.io.IOException;

public class Day052 {
    public static void main(String[] args) {
        try {
            openFile();
        } catch (IOException e) {
            throw new UncheckedIOException("Erro de IO", e);
        }
    }

    static void openFile() throws IOException {
        FileReader reader = new FileReader("inexistente.txt");
    }
}

class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(String message, IOException cause) {
        super(message, cause);
    }
}