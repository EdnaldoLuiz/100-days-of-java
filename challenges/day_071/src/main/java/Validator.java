package challenges.day_071.src.main.java;

interface Validator {

    void setNext(Validator validator);
    void validate(User user);
}