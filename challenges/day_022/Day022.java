package challenges.day_022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day022 {
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "dir");
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}