import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        cliente.setNome(nome);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);


        System.out.println("Digite o valor para depositar: ");
        double valorSaque = sc.nextDouble();
        cc.depositar(valorSaque);

        System.out.println("Digite o valor para transferencia: ");
        double valorTransferencia = sc.nextDouble();
        cc.transferir(valorTransferencia, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }

}