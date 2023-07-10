package atividades;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os metros: ");
        int metros = scanner.nextInt();
        int centimetros = metros * 100;

        System.out.println(centimetros + " Centímetros");

        scanner.close();
    }
}
