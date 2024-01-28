# Desafio 28

Ordenando uma Lista por um atributo específico

## Resultado

```java
package challenges.day_028;

import java.util.ArrayList;
import java.util.List;

public class Day028 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 20));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("José", 22));

        pessoas.sort((Pessoa p1, Pessoa p2) -> Integer.compare(p1.idade, p2.idade));
        pessoas.forEach((p) -> System.out.println(p.nome + " - " + p.idade));
    }
}
class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

```