package atividades.aulas1415;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Domingo");
                break;
            case 5:
                System.out.println("Domingo");
                break;
            case 6:
                System.out.println("Domingo");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Inválido");
        }

        scanner.close();
    }
}
