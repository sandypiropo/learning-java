package atividades;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado quadrado: ");
        double lsdo = sc.nextDouble();
        double area = Math.pow (lsdo, 2);
        System.out.print("Área do quadrado = " + area);
        System.out.println(" Dobro = " + (area * 2));
    }
}
