package atividades.aulas1415;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno é: " + media);

        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
