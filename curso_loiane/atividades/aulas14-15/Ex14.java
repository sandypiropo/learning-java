package atividades.aulas1415;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = -1;
        double nota2 = -2;
        boolean valoresValidos = false;
        String nota;

        do {
            try{
                System.out.print("Primeira nota: ");
                nota1 = scanner.nextDouble();
                System.out.print("Segunda nota: ");
                nota2 = scanner.nextDouble();

                if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
                    System.out.println("Inválido escreva novamente");
                } else {
                    valoresValidos = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Digite um número válido.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        } while (!valoresValidos);

        double media = (nota1 + nota2) / 2;

        if (media < 4.0) {
            System.out.println("E");
            nota = "E";
        } else if (media < 6.0) {
            System.out.println("D");
            nota = "D";
        } else if (media < 7.5) {
            System.out.println("C");
            nota = "C";
        } else if (media < 9.0) {
            System.out.println("B");
            nota = "B";
        } else {
            System.out.println("A");
            nota = "A";
    }

        if (nota.equals("E") || nota.equals("D")) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }
        scanner.close();
    }
}
