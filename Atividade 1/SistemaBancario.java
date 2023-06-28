import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Criação de clientes
    Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
    Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00");

    // Criação de contas correntes
    ContaCorrente contaCorrente1 = new ContaCorrente(1, 1000.0, cliente1);
    ContaCorrente contaCorrente2 = new ContaCorrente(2, 500.0, cliente2);

    // Criação de contas poupança
    ContaPoupanca contaPoupanca1 = new ContaPoupanca(3, 2000.0, cliente1, 0.05);
    ContaPoupanca contaPoupanca2 = new ContaPoupanca(4, 1000.0, cliente2, 0.04);

    // Criação de investimentos LCI
    LCI investimentoLCI1 = new LCI(5, 3000.0, cliente1, 0.06);
    LCI investimentoLCI2 = new LCI(6, 2000.0, cliente2, 0.05);

    int opcao = -1;

    while (opcao != 0) {
     
    // Interação com o usuário
    System.out.println("=== Sistema Bancário ===");
    System.out.println("\nSelecione uma opção:");
    System.out.println("1 - Consultar saldo da conta corrente");
    System.out.println("2 - Consultar saldo da conta poupança");
    System.out.println("3 - Consultar saldo do investimento LCI");
    System.out.println("4 - Fazer um saque na conta corrente");
    System.out.println("5 - Fazer um depósito na conta corrente");
    System.out.println("6 - Transferir dinheiro entre contas correntes");
    System.out.println("7 - Aplicar rendimento na conta poupança");
    System.out.println("8 - Aplicar rendimento no investimento LCI");
    System.out.println("0 - Sair");
    System.out.print("Opção selecionada: ");

    opcao = scanner.nextInt();

    switch (opcao) {

        case 1:
            System.out.println("Saldo da conta corrente: R$" + contaCorrente1.consultarSaldo());
            break;
        case 2:
            System.out.println("Saldo da conta poupança: R$" + contaPoupanca1.consultarSaldo());
            break;
        case 3:
            System.out.println("Saldo do investimento LCI: R$" + investimentoLCI1.consultarSaldo());
            break;
        case 4:
            System.out.print("Informe o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            contaCorrente1.sacar(valorSaque);
            break;
        case 5:
            System.out.print("Informe o valor do depósito: ");
            double valorDeposito = scanner.nextDouble();
            contaCorrente1.depositar(valorDeposito);
            break;
        case 6:
        {
            System.out.print("Informe o valor da transferência: ");
            double valorTransferencia = scanner.nextDouble();
            contaCorrente1.transferir(contaCorrente2, valorTransferencia);
        }
            
        case 7:
            contaPoupanca1.aplicarRendimento();
            break;
        case 8:
            investimentoLCI1.aplicarRendimento();
            break;
        case 0:
            break;
        default:
            System.out.println("Opção inválida.");
        }

    }

    scanner.close();
}

}
