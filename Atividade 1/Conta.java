class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int numero, double saldo, Cliente titular) 
    {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numero);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numero);
        } else {
            System.out.println("Saldo insuficiente na conta " + numero);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta " + numero + ":");
        System.out.println("Saldo: R$" + saldo);
    }
}
