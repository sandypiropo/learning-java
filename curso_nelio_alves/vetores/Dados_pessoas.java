package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?: ");
        int qtd = sc.nextInt();

        sc.nextLine();

        double[] altura = new double[qtd];
        String[] sexo = new String[qtd];
        double menorAltura = Double.MAX_VALUE;
        double maioraltura = 0;
        double mediaAlturaMulheres = 0, somaAlturaMulheres = 0; //somar altura e calcular media
        int qtdHomens = 0, qtdMulheres = 0;

        for (int i=0;i<qtd;i++) {
            System.out.println("Altura da " + (i+1) + " pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.println("Sexo da " + (i+1) + " pessoa: ");
            sexo[i] = sc.next();
            sc.nextLine();
            if (sexo[i].equals("M")) {
                qtdHomens++;
            } else if (sexo[i].equals("F")) {
                qtdMulheres++;
                somaAlturaMulheres += altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
            if (altura[i] > maioraltura) {
                maioraltura = altura[i];
            }
        }
        if (qtdMulheres > 0) {
            mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maioraltura);
        System.out.println("Média das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulheres));
        System.out.println("Quantidade de homens: " + qtdHomens);
        sc.close();
    }
}
