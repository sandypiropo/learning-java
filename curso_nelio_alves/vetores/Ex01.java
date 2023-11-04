package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0; // contador de numeros negativos

        System.out.println("Quantos números você vai digitar?: ");
        int qtd = sc.nextInt();

        int[] vetor = new int[qtd];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] < 0) {
                contador++; // calcula numeros negativos para criação da array do tamanho certo
            }
        }

        int[] numerosNegativos = new int[contador];

        int index = 0;

        // passa pelos valores do vetor para colocar os negativos na nova lista
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                numerosNegativos[index] = vetor[i];
                index++;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("Números negativos: " + Arrays.toString(numerosNegativos));

        sc.close();
    }
}
