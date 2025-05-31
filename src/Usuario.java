class Usuario {
    private String nome;
    private int idade;
    private ContaBancaria conta;

    public Usuario(String nome, int idade, ContaBancaria conta) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public ContaBancaria getConta() {
        return conta;
    }
}


