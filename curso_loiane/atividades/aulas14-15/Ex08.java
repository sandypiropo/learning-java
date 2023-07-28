package atividades.aulas1415;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double produto1 = scanner.nextDouble();

        System.out.println("Digite o preço do segundo produto: ");
        double produto2 = scanner.nextDouble();

        System.out.println("Digite o preço do terceiro produto: ");
        double produto3 = scanner.nextDouble();

        String melhorOpcao;

        if (produto1 < produto2 && produto1 < produto3) {
            melhorOpcao = "primeiro produto";
        } else if (produto2 < produto1 && produto2 < produto3) {
            melhorOpcao = "segundo produto";
        } else {
            melhorOpcao = "terceiro produto";
        }

        System.out.println("A melhor opção é comprar o " + melhorOpcao + ".");
    }
}
