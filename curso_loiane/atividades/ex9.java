package atividades;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = sc.nextDouble();

        double celsius = (farenheit - 32) / (float) 1.8;
        System.out.printf("Celsius: %.1f", celsius);
    }
}
