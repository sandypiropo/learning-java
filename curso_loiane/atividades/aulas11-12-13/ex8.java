package atividades;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor por hora: ");
        double valorPorHora = sc.nextDouble();

        System.out.println("Total de horas de trabalho no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioTotal = valorPorHora * horasTrabalhadas;

        System.out.println("TOTAL: " + salarioTotal);
    }
}
