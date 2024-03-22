package challenges.day_082;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Day082 {

    public static void main(String[] args) {
        Path caminho = Paths.get("teste.txt");
        System.out.println("Nome do arquivo: " + caminho.getFileName());
        System.out.println("Raiz do caminho: " + caminho.getRoot());
    }
}