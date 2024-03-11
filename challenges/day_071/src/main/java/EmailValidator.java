package challenges.day_071.src.main.java;

public class EmailValidator implements Validator {
    private Validator next;

    public void setNext(Validator validator) {
        this.next = validator;
    }

    public void validate(User user) {
        if (user.email == null || user.email.isEmpty()) {
            throw new IllegalArgumentException("Email invalido");
        } else if (next != null) {
            next.validate(user);
        }
    }
}