package atividades.aulas1415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numero = new ArrayList<>();

        System.out.print("Digite o valor de a: ");
        numero.add(scanner.nextInt());

        System.out.print("Digite o valor de b: ");
        numero.add(scanner.nextInt());

        System.out.print("Digite o valor de c: ");
        numero.add(scanner.nextInt());

        Collections.sort(numero, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente: " + numero);

        scanner.close();
    }
}
