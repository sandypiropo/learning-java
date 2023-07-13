package empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta(111, "Mario", 2000, 500);
        Conta c2 = new Conta(112, "Luigi", 0, 500);

        c1.info();

        double valor = 0;
        int numConta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n[1] Sacar\n[2] Depositar\n[3] Transferir");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para sacar: ");
                valor = scanner.nextDouble();

                if (!c1.sacar(valor)) {
                    System.out.println("Problema ao sacar");
                }
                break;
            case 2:
                System.out.print("Digite o valor para depositar: ");
                valor = scanner.nextDouble();

                if (!c1.depositar(valor)) {
                    System.out.println("Problema ao depositar");
                }
                break;
            case 3:
                System.out.print("Digite o valor para transferir: ");
                valor = scanner.nextDouble();
                System.out.print("Número da conta: ");
                numConta = scanner.nextInt();
                if (!c1.transferir(valor)) {
                    System.out.println("Problema ao transferir");
                }
                if (numConta == 112) {
                    c2.depositar(valor);
                    System.out.println("Valor de " + valor + "R$ Transferido para a conta: " + numConta);
                    System.out.println();
                    c2.info();
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println();
        c1.info();



    }
}
