package vetores;

import java.util.Scanner;

public class Mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar?: ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        String[] vetorNome = new String[numPessoas];
        int[] vetorIdade = new int[numPessoas];
        int idadeMaisVelha = Integer.MIN_VALUE;
        int indiceMaisVelha = -1;

        for (int i=0;i<numPessoas;i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.println("Nome: ");
            vetorNome[i] = sc.nextLine();
            System.out.println("Idade: ");

            // Ler a linha e converter para um inteiro
            try {
                vetorIdade[i] = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite uma idade válida: ");
                i--; // Volta uma iteração para tentar novamente
                continue;
            }

            if (vetorIdade[i] > idadeMaisVelha) {
                idadeMaisVelha = vetorIdade[i];
                indiceMaisVelha = i;
            }
        }


        System.out.println("PESSOA MAIS VELHA: " + vetorNome[indiceMaisVelha] + " que tem " + idadeMaisVelha + " anos");

        sc.close();
    }
}
