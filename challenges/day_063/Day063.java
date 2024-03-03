package challenges.day_063;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Day063 {
      public static void main(String[] args) {
            Forma circulo = new Circulo(5.0);
            Forma retangulo = new Retangulo(4.0, 5.0);

            System.out.println(circulo.area());
            System.out.println(retangulo.area()); 
      }
}

sealed interface Forma permits Circulo, Retangulo {
      double area();
}

final record Circulo(double raio) implements Forma {
      public double area() {
            return Math.PI * raio * raio;
      }
}

final record Retangulo(double largura, double altura) implements Forma {
      public double area() {
            return largura * altura;
      }
}