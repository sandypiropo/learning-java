package atividades.aulas1415;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra (f ou m): ");
        char letra = scanner.next().charAt(0);

        if (letra == 'f' || letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'm' || letra == 'M') {
            System.out.println("Masculino");
        } else {
            System.out.println("Letra digitada inválida. Digite apenas 'f' ou 'm'.");
        }

        scanner.close();
    }
}
