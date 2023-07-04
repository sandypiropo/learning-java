package atividades;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do quadrado: ");
        int quadrado = sc.nextInt();
        int area = quadrado * quadrado;
        int dobro = area * 2;
        System.out.print("Área do quadrado = " + area);
        System.out.println(" Dobro = " + dobro);
    }
}
