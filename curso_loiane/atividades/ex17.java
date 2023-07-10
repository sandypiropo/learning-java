package atividades;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double areaPintada = scanner.nextDouble();

        // Considerando 1 litro para cada 6 metros quadrados e 10% de folga
        double litrosTinta = (areaPintada / 6) * 1.1;

        // Comprar apenas latas de 18 litros
        int latas18L = (int) Math.ceil(litrosTinta / 18);
        double precoLatas18L = latas18L * 80.0;

        // Comprar apenas galões de 3,6 litros
        int galoes3_6L = (int) Math.ceil(litrosTinta / 3.6);
        double precoGaloes3_6L = galoes3_6L * 25.0;

        // Misturar latas e galões
        int latasMix = (int) Math.floor(litrosTinta / 18);
        int galoesMix = (int) Math.ceil((litrosTinta - latasMix * 18) / 3.6);
        double precoMix = latasMix * 80.0 + galoesMix * 25.0;

        System.out.println("Quantidade de tinta a ser comprada:");
        System.out.println("Comprar apenas latas de 18 litros: " + latas18L + " lata(s)");
        System.out.println("Preço: R$" + precoLatas18L);
        System.out.println();
        System.out.println("Comprar apenas galões de 3,6 litros: " + galoes3_6L + " galão(ões)");
        System.out.println("Preço: R$" + precoGaloes3_6L);
        System.out.println();
        System.out.println("Misturar latas e galões:");
        System.out.println("Latas de 18 litros: " + latasMix + " lata(s)");
        System.out.println("Galões de 3,6 litros: " + galoesMix + " galão(ões)");
        System.out.println("Preço: R$" + precoMix);

        scanner.close();
    }
}
