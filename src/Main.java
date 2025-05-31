public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(12345);

        Usuario usuario = new Usuario("Carlos", 25, conta);

        GerenciadorUsuarios gerenciador = new GerenciadorUsuarios();
        gerenciador.adicionarUsuario(usuario);

        usuario.getConta().depositar(100);
        usuario.getConta().sacar(50);

        System.out.println("Usuário: " + usuario.getNome() + ", Idade: " + usuario.getIdade());
        System.out.println("Conta: " + usuario.getConta().getNumeroConta() + ", Saldo: " + usuario.getConta().getSaldo());

        gerenciador.listarUsuarios();
    }
}

