class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    public void transferir(Conta destino, double valor) {
        if (consultarSaldo() >= valor) {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada da conta " + getNumero() + " para a conta " + destino.getNumero());
        } else {
            System.out.println("Saldo insuficiente na conta " + getNumero() + " para realizar a transferência");
        }
    }
}
