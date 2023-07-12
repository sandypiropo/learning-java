package atividades;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota:");
        float nota3 = scanner.nextFloat();

        System.out.println("Digite a quarta nota:");
        float nota4 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média = " + media);

        scanner.close();
    }
}
