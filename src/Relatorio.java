public class Relatorio {
        public void gerarRelatorioUsuario(Usuario u) {
            System.out.println("Relatório do Usuário:");
            System.out.println("Nome: " + u.nome);
            System.out.println("Idade: " + u.idade);
            System.out.println("Conta: " + u.conta.numeroConta);
            System.out.println("Saldo: " + u.conta.saldo);
        }

}
