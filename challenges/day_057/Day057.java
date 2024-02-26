package challenges.day_057;

import java.util.stream.Stream;

public class Day057 {

      public static void main(String[] args) {
           Stream.iterate(0, n -> n + 1)
            .forEach(System.out::println); 
      }
}