package atividades;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        float raio = scan.nextFloat();
        float areaCirculo = 2 * (float) 3.14 * raio;
        System.out.printf("Aréa = %.3f", areaCirculo);
    }
}
