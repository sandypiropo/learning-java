package vetores;

import java.util.Scanner;

public class Media_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int elementos = sc.nextInt();

        int[] vetorzao = new int[elementos];
        int listaPar = 0;
        int soma = 0;

        for (int i=0 ; i<vetorzao.length ; i++) {
            System.out.println("Digite um número: ");
            vetorzao[i] = sc.nextInt();
            if (vetorzao[i] % 2 == 0) {
                listaPar++;
            }
        }

        int[] vetorPar = new int[listaPar];
        int index = 0;

        for (int i=0 ; i<vetorzao.length; i++) {
            if (vetorzao[i] % 2 == 0) {
                vetorPar[index] = vetorzao[i];
                soma += vetorPar[index];
                index++;
            }
        }

        if (listaPar != 0) {
            double mediaPar = (double) soma / listaPar;
            System.out.println("MÉDIA DOS PARES: " + mediaPar);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
