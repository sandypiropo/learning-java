package atividades.aulas1415;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int numero3 = scanner.nextInt();

        int maiorNumero = Math.max(numero1, Math.max(numero2, numero3));

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
