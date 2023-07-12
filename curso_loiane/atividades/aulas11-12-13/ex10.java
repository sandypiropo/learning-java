package atividades;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double farenheit = celsius * (float) 1.8 + 32;
        System.out.printf("Farenheit: %.1f", farenheit);
    }
}

