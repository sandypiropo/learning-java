package atividades.aulas1415;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int data = scanner.nextInt();

        if (data % 4 == 0) {
            System.out.println("Bissexto");
        } else {
            System.out.println("Não é Bissexto");
        }

        scanner.close();
    }

}
