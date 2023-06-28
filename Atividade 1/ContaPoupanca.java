class ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca(int numero, double saldo, Cliente titular, double taxaJuros) {
        super(numero, saldo, titular);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarRendimento() {
        double rendimento = consultarSaldo() * taxaJuros;
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na conta poupança " + getNumero());
    }
}
