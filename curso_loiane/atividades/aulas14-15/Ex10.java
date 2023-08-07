package atividades.aulas1415;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! ");
        String periodo = scanner.next().toLowerCase().replaceAll(" ", "");

        if (periodo.equals("m") || periodo.equals("matutino")) {
            System.out.println("Boa tarde");
        }
        else if (periodo.equals("v") || periodo.equals("vespertino")) {
            System.out.println("Bom dia!");
        }
        else if (periodo.equals("n") || periodo.equals("noturno")) {
            System.out.println("Boa noite!");
        }
        else {
                System.out.println("Comando desconhecido");
        }

        scanner.close();
    }
}
