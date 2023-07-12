package atividades;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Peso do peixe: ");
        float pesoPeixe = sc.nextFloat();

        float exc = pesoPeixe - 50;
        float multa = exc * 4f;

        if (multa <= 0) {
            System.out.print("Valor a pagar = 0.00");

        }
        else {
            System.out.printf("Valor a pagar = %.2f", multa);
        }
    }
}
