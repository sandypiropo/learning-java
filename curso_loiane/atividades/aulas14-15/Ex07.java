package atividades.aulas1415;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int numero3 = scanner.nextInt();

        int maior = encontrarMaior(numero1, numero2, numero3);
        int menor = encontrarMenor(numero1, numero2, numero3);

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }

    public static int encontrarMaior(int a, int b, int c) {
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;
    }

    public static int encontrarMenor(int a, int b, int c) {
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        return menor;
    }
}
