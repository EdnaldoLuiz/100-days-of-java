package challenges.day_071;

import java.util.List;

public class Day071 {
    public static void main(String args[]) {

        private final List<Validator> validator;

        public Day071(Validator validator) {
            this.validator = validator;
        }

        User user = new User();
        user.email = "luiz@example.com";
        user.cpf = "12345678901";

        validator.forEach(v -> v.validate())
    }
}