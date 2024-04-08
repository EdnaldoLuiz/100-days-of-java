package challenges.day_098;

import java.util.OptionalDouble;

public class Day098 {

    public static void main(String[] args) {
        OptionalDouble optionalDoubleEmpty = OptionalDouble.empty();

        OptionalDouble optionalDoubleWithValue = OptionalDouble.of(5.0);

        if (optionalDoubleWithValue.isPresent()) {
            double value = optionalDoubleWithValue.getAsDouble();
            System.out.println("Valor presente: " + value);
        } else {
            System.out.println("Nenhum valor presente.");
        }

        optionalDoubleWithValue.ifPresent(val -> System.out.println("Valor presente: " + val));

        double defaultValue = optionalDoubleEmpty.orElse(10.0);
        System.out.println("Valor padrão: " + defaultValue);

        try {
            double result = optionalDoubleEmpty.orElseThrow(() -> new RuntimeException("Valor não presente"));
            System.out.println("Valor: " + result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
