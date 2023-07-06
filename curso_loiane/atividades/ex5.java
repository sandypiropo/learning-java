package atividades;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner metro = new Scanner(System.in);
        System.out.print("Digite os metros: ");
        int metros = metro.nextInt();
        int cen = metros * 100;
        System.out.println(cen + " Centímetros");
    }
}
