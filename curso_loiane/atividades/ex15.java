package atividades;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        float salarioHora = sc.nextFloat();

        System.out.print("Número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        float bruto = salarioHora * horasTrabalhadas;
        float impostoDeRenda = bruto * 0.11f;
        float inss = bruto * 0.08f;
        float sindicato = bruto * 0.05f;
        float total = impostoDeRenda + inss + sindicato;
        float liquido = bruto - total;

        System.out.printf("SALÁRIO BRUTO: %.2f\n", bruto);
        System.out.printf("IMPOSTO DE RENDA: %.2f\n", impostoDeRenda);
        System.out.printf("VALOR INSS: %.2f\n", inss);
        System.out.printf("VALOR SINDICATO: %.2f\n", sindicato);
        System.out.printf("SALÁRIO LIQUIDO: %.2f\n", liquido);

        sc.close();
    }
}
