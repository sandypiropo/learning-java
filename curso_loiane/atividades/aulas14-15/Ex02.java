package atividades.aulas1415;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        System.out.println((valor < 0)?"Negativo":"Positivo");
    }
}
