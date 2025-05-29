public class Usuario {
        public String nome;
        public int idade;
        public Conta conta;

        public Usuario(String nome, int idade) {
            nome = nome; // erro: deveria ser this.nome
            idade = idade; // erro: deveria ser this.idade
        }
    }
}

