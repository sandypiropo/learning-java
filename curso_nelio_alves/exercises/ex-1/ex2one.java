package opcomparativos;

import java.util.Scanner;

public class ex2one {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int nint = number.nextInt();

        if (nint < 0) {
            System.out.printf("%d = NEGATIVO", nint);
        }
        else {
            System.out.printf("%d = NÃO NEGATIVO", nint);
        }

        number.close();
    }
}
