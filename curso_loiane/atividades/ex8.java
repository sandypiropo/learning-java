package atividades;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor por hora: ");
        int valorPorHora = sc.nextInt();

        System.out.println("Total de horas de trabalho no mês: ");
        float horasTrabalhadas = sc.nextFloat();

        float salarioTotal = valorPorHora * horasTrabalhadas;

        System.out.printf("TOTAL: %.2f\n", salarioTotal);
    }
}
