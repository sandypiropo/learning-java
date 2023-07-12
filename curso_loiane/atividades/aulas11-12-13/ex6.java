package atividades;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = scanner.nextFloat();
        double areaCirculo = Math.PI * Math.pow (raio, 2);

        System.out.println("Área = " + areaCirculo);

        scanner.close();
    }
}
