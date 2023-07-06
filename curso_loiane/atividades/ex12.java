package atividades;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        float h = sc.nextFloat();
        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = sc.next().toUpperCase();
        float pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = (72.7f * h) - 58f;
        }
        else if (sexo.equals("F")) {
            pesoIdeal = (62.1f * h) - 44.7f;
        }
        else {
            System.out.println("Sexo inválido");
            return;
        }

        System.out.printf("Peso ideal: %.2f", pesoIdeal);

    }
}
