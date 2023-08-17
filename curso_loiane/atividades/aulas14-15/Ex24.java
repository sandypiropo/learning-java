package atividades.aulas1415;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 número: ");
        double a = scanner.nextInt();
        System.out.print("2 número: ");
        double b = scanner.nextInt();
        System.out.print("Digite a operação (+, -, *, /, %): ");
        char simbolo = scanner.next().charAt(0);

        double calculo = operacao (a, b, simbolo);

        System.out.println(calculo);

        if (isInt(calculo)) {
            System.out.println("O resultado é um número inteiro.");
        } else {
            System.out.println("O resultado é um número decimal.");
        }

        if (parOuImpar(calculo)) {
            System.out.println("O número é Par.");
        } else {
            System.out.println("O número é Ímpar");
        }

        if (positivoOuNegativo(calculo)) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        scanner.close();
    }

    public static double operacao(double x, double y, char simb) {
        double resultado = 0;

        switch (simb) {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                if (y != 0) {
                    resultado = x / y;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case '%':
                resultado = x % y;
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        return resultado;
    }

    public static boolean isInt(double number) {
        return number == (int) number;
    }

    public static boolean parOuImpar(double pOi) {
        return pOi % 2 == 0;
    }

    public static boolean positivoOuNegativo(double pon) {
        return pon > 0;
    }
}
