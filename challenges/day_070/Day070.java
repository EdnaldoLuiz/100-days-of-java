package challenges.day_070;

public class Day070 {
    public static void main(String args[]) {
        Usuario usuario = new Usuario.Builder()
                .comNome("Luiz")
                .comEmail("luiz@example.com")
                .comIdade(25)
                .build();
                
        System.out.println(usuario);
    }
}
class Usuario {
    private String nome;
    private String email;
    private int idade;

    private Usuario(Builder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.idade = builder.idade;
    }

    public static class Builder {
        private String nome;
        private String email;
        private int idade;

        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder comEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder comIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }
}