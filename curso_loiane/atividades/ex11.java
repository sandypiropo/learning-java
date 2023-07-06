package atividades;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int primeiroInt = SC.nextInt();
        System.out.print("Digite um numero inteiro: ");
        int segundoInt = SC.nextInt();
        System.out.print("Digite um numero real: ");
        float real = SC.nextFloat();

        int A = primeiroInt * 2 + segundoInt / 2;
        float B = 3 * primeiroInt + real;
        float C = real * real;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
