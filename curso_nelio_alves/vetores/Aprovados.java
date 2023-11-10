package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?: ");
        int qtdAlunos = sc.nextInt();

        sc.nextLine();

        String[] nomeAlunos = new String[qtdAlunos];
        double[] primeiraNota = new double[qtdAlunos];
        double[] segundaNota = new double[qtdAlunos];
        double[] somaNotas = new double[qtdAlunos];


        for (int i=0; i<qtdAlunos; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) +" aluno");
            nomeAlunos[i] = sc.nextLine();
            primeiraNota[i] = sc.nextDouble();
            segundaNota[i] = sc.nextDouble();

            sc.nextLine();

            somaNotas[i] = primeiraNota[i] + segundaNota[i];
        }

        System.out.println("Alunos aprovados: ");
        for (int i=0;i<somaNotas.length;i++) {
            if (somaNotas[i] / 2 >= 6.0) {
                System.out.println(nomeAlunos[i]);
            }
        }
        sc.close();
    }
}
