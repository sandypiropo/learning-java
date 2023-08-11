package atividades.aulas1415;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorHoras, salarioBruto, ir, inss, fgts, somaDescontos, total;

        System.out.print("Valor p/ hora: ");
        valorHoras = scanner.nextDouble();
        System.out.print("Quantidade de horas trabalhadas: ");
        int qtdHoras = scanner.nextInt();

        salarioBruto = valorHoras * qtdHoras;

      if (salarioBruto <= 900) {
          ir = 0;
          System.out.println("Isento");
      } else if (salarioBruto <= 1500) {
          ir = 5;
      } else if (salarioBruto <= 2500) {
          ir = 10;
      } else {
          ir = 20;
      }

        inss = salarioBruto * 10 / 100;
        fgts = salarioBruto * 11 / 100;
        somaDescontos = (ir * salarioBruto / 100) + inss;
        total = salarioBruto - somaDescontos;

        System.out.printf("SALÁRIO BRUTO: %.2f * %d = %.2f%n", valorHoras, qtdHoras, salarioBruto);
        System.out.printf("(-) IR (%d%%): %.2f%n", (int) ir, ir * salarioBruto/100);
        System.out.printf("(-) INSS (10%%): %.2f%n", inss);
        System.out.printf("(-) FGTS (11%%): %.2f%n", fgts);
        System.out.printf("Total de descontos: %.2f%n", somaDescontos);
        System.out.printf("Salário líquido: %.2f%n", total);
    }
}
