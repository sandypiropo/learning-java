package atividades.aulas1415;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Lado A: ");
        a = scanner.nextInt();
        System.out.print("Lado B: ");
        b = scanner.nextInt();
        System.out.print("Lado C: ");
        c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a != b && b != c) {
            System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Triângulo Isósceles");
        }

        scanner.close();
    }
}
