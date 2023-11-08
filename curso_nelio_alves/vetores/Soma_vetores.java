package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Soma_vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int tamanhoVetor= sc.nextInt();

        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0 ; i<vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));

        int[] vetorResultante = new int[tamanhoVetor];

        System.out.println("VETOR RESULTANTE: ");
        for (int i=0; i<vetorResultante.length; i++) {
             vetorResultante[i] = vetorA[i] + vetorB[i];
        }

        System.out.println(Arrays.toString(vetorResultante));
        sc.close();
    }
}
