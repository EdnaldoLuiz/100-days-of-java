# Desafio 45

Utilizando java.util.Comparator#comparing para ordenar uma Lista

## Resultado

```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day045 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 30),
            new Person("Alice", 20),
            new Person("Bob", 25)
        );

        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {return name;}

    int getAge() {return age;}

    @Override
    public String toString() {return name + ": " + age;}
}
```