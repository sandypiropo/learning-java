//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

package vetores;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiornumero;

        System.out.println("Quantos numeros você vai digitar?: ");
        int qtd = sc.nextInt();

        int[] numeros = new int[qtd];

        for(int i=0;i<numeros.length;i++) {
            System.out.println("Escreva o número: ");
            int n = sc.nextInt();

            
        }


        sc.close();

    }
}
