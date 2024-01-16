package challenges.day_015;

public class Day015 {
    public static void main(String[] args) {

        new User.UserBuilder()
            .setFirstName("John")
            .setLastName("Doe")
            .build();

    }      
}

class User {

    private String firstName;
    private String lastName;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class UserBuilder {

        private String firstName;
        private String lastName;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}