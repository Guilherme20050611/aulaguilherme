
    public class SistemaBanco {
        public static void main(String[] args) {
            Usuario u = new Usuario("Carlos", -25);
            u.conta = new Conta(12345);
            u.conta.depositar(-100);
            u.conta.sacar(50);
            System.out.println("Usuário: " + u.nome + ", Idade: " + u.idade);
            System.out.println("Conta: " + u.conta.numeroConta + ", Saldo: " + u.conta.saldo);
        }
    }
}
