package atividades;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("Digite suas notas:");
        Scanner notas = new Scanner(System.in);
        float nota1 = notas.nextFloat();
        float nota2 = notas.nextFloat();
        float nota3 = notas.nextFloat();
        float nota4 = notas.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 2;
        System.out.println("Média = " + media);
    }
}
