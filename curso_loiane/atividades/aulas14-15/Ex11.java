package atividades.aulas1415;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        double reajuste;

        if (salario <= 250) {
            reajuste = (salario * 20) / 100;
        } else if (salario <= 699) {
            reajuste = (salario * 15) / 100;
        } else if (salario <= 1500) {
            reajuste = (salario * 10) / 100;
        } else {
            reajuste = (salario * 5) / 100;
        }

        double total = salario + reajuste;
        System.out.printf("Seu salário = %.2f%nReajuste de %.2f%nTotalizando: %.2f", salario, reajuste, total);
    }
}
