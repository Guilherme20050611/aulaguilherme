
    public class Conta {
        public int numeroConta;
        public double saldo;
        public Conta(int numeroConta) {

        }
        this.numeroConta = numeroConta;
        saldo = 0;
    }
    public void depositar(double valor) {
        saldo = saldo + valor; // Sem validação para valor negativo
    }
    public void sacar(double valor) {
        saldo = saldo - valor; // Sem validação para saldo insuficiente ou valor negativo
    }
}
        }

}
