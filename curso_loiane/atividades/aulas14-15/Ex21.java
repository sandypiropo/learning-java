package atividades.aulas1415;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a sacar: ");
        int valorSaque = scanner.nextInt();

        int notas100, notas50, notas20, notas10, notas5;

        notas100 = valorSaque / 100;
        valorSaque %= 100;
        notas50 = valorSaque / 50;
        valorSaque %= 50;
        notas20 = valorSaque / 20;
        valorSaque %= 20;
        notas10 = valorSaque / 10;
        valorSaque %= 10;
        notas5 = valorSaque / 5;

        System.out.println("Serão necessárias:");
        if (notas100 > 0) {
            System.out.printf("%d nota(s) de 100%n", notas100);
        }
        if (notas50 > 0) {
            System.out.printf("%d nota(s) de 50%n", notas50);
        }
        if (notas20 > 0) {
            System.out.printf("%d nota(s) de 20%n", notas20);
        }
        if (notas10 > 0) {
            System.out.printf("%d nota(s) de 10%n", notas10);
        }
        if (notas5 > 0) {
            System.out.printf("%d nota(s) de 5%n", notas5);
        }
    }
}
