package exceção;

import java.util.Scanner;

public class ClassePrincipalCorrente {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = leitor.nextInt();
        System.out.print("Digite o saldo inicial: ");
        
        double saldoInicial = leitor.nextDouble(); 
        
        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do saque " + (i + 1) + ": ");
            double valorSaque = leitor.nextDouble();

            try {
                conta.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
