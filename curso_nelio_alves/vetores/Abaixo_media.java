package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int tamVetor = sc.nextInt();
        double soma = 0.0;

        double[] vetor = new double[tamVetor];
        int abaixoMedia = 0;

        for (int i=0 ; i<vetor.length ; i++) {
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
            if (vetor[i] < 10.0) {
                abaixoMedia++;
            }
        }

        double media = soma / tamVetor;
        System.out.println("Media do vetor: " + media);

        double[] elementosAbaixoMedia = new double[abaixoMedia];

        System.out.println("Elementos abaixo da media: ");
        int index = 0;

        for (int i=0 ; i<vetor.length ; i++) {
            if (vetor [i] <= 10.0) {
                elementosAbaixoMedia[index] = vetor[i];
                index++;
            }
        }

        for (int i=0 ; i<elementosAbaixoMedia.length; i++) {
            System.out.println(elementosAbaixoMedia[i]);
        }

        sc.close();
    }
}
