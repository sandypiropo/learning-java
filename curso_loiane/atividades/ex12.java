package atividades;

import java.util.Scanner;

public class ex12 { // junto com o ex13
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();
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

        float imc = peso / (h * h);

        if (imc < 18.5) {
            System.out.printf("%.2f - abaixo do peso", imc);
        }
        else if (imc <= 25) {
            System.out.printf("%.2f - dentro do ideal", imc);
        }
        else if ( imc > 25) {
            System.out.printf("%.2f - Acima do peso", imc);
        }

        System.out.printf("\nPeso ideal: %.2f", pesoIdeal);

    }
}
