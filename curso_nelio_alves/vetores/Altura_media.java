package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Altura_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaAltura = 0;
        int menorQue16 = 0;

        System.out.println("Quantas pessoas serão digitadas?: ");
        int nPessoas = sc.nextInt();

        String[] nomesMenoresQue16 = new String[nPessoas];
        double[] alturas = new double[nPessoas];
        int[] idades = new int[nPessoas];


        for (int i=0; i<nPessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "° pessoa:");
            System.out.println("Nome:");
            nomesMenoresQue16[i] = sc.next();
            System.out.println("Idade:");
            idades[i] = sc.nextInt();
            System.out.println("Altura:");
            alturas[i] = sc.nextDouble();
            mediaAltura += alturas[i];
            if (idades[i] < 16) {
                menorQue16++;
            }
        }

        mediaAltura /= nPessoas;
        System.out.println("Altura média: " + mediaAltura);
        sc.close();

        System.out.println("Pessoas menores que 16 = " + menorQue16);
        for (int i=0 ; i<nPessoas ; i++) {
            if (idades[i] < 16) {
                System.out.println(nomesMenoresQue16[i]);
            }
        }

    }
}
