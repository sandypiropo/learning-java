package ex;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        int soma;

        System.out.print("Digite o primeiro número: ");
        Scanner numeroUm = new Scanner(System.in);
        int n1 = numeroUm.nextInt();

        System.out.print("Digite o segundo número: ");
        Scanner numeroDois = new Scanner(System.in);
        int n2 = numeroDois.nextInt();

        soma = (n1 + n2);

        System.out.println(soma);
    }
}
