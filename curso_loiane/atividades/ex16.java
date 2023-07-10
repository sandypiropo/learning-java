package atividades;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a área em metros quadrados da parede: ");
        double areaParede = sc.nextDouble();

        double metrosPorLata = 18 * 3; // Cada lata de 18 litros pinta 54 metros quadrados
        int latasNecessarias = (int) (areaParede / metrosPorLata);

        if (areaParede % metrosPorLata != 0) {
            latasNecessarias++;
        }
        System.out.println("Serão necessárias " + latasNecessarias + " latas de tinta de 18 litros.");

        sc.close();
    }
}
