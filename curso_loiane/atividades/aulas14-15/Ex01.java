package atividades.aulas1415;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maiorValor;
        String nomeMaiorValor;

        System.out.println("Digite o primeiro número:");
        double A = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        double B = scan.nextDouble();

        if (A > B) {
            maiorValor = A;
            nomeMaiorValor = "A";
        } else {
            maiorValor = B;
            nomeMaiorValor = "B";
        }
        System.out.println("Maior valor: " + nomeMaiorValor + " = " + maiorValor);
    }
}
