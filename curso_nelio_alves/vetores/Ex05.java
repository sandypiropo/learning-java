package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário quantos números serão digitados
        System.out.println("Quantos números você vai digitar?: ");
        int qtd = sc.nextInt();

        // Cria um vetor de inteiros para armazenar os números digitados
        int[] numeros = new int[qtd];

        // Solicita ao usuário que digite os números e armazena no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o " + (i + 1) + "° número: ");
            numeros[i] = sc.nextInt();
        }

        // Inicializa variáveis para o maior número e sua posição
        int maior = Integer.MIN_VALUE;
        int posicaoMaior = -1;

        // Encontra o maior número e sua posição no vetor
        for (int i = 0; i < qtd; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        sc.close();

        // Exibe o maior número e sua posição
        System.out.println("Maior número: " + maior);
        System.out.println("Posição do maior número: " + posicaoMaior);
        System.out.println(Arrays.toString(numeros)); // Exibe todo o vetor
    }
}
