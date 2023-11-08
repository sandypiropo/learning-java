package vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media;

        System.out.println("Quantos números você vai digitar?: ");
        int qtd = sc.nextInt();

        double[] vetor = new double[qtd];

        for (int i=0 ; i<vetor.length; i++) {
            System.out.println("Digite o número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        media = soma / qtd;

        System.out.println(Arrays.toString(vetor));
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
        sc.close();
    }
}
