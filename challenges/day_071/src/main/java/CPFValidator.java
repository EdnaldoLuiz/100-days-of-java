package challenges.day_071.src.main.java;

public class CPFValidator implements Validator {
    private Validator next;

    public void setNext(Validator validator) {
        this.next = validator;
    }

    public void validate(User user) {
        if (user.cpf == null || user.cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF invalido");
        } else if (next != null) {
            next.validate(user);
        }
    }
}