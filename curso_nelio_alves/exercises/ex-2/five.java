package ex;

import java.util.Locale;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int c1, n1, c2, n2;
        double v1, v2, sum;

        System.out.print("CODE 1ST PIECE: ");
        Scanner code1 = new Scanner(System.in);
        c1 = code1.nextInt();
        System.out.print("NUMBER 1ST PIECE: ");
        n1 = code1.nextInt();
        System.out.print("VALUE 1ST PIECE: ");
        v1 = code1.nextDouble();


        System.out.print("CODE 2ST PIECE: ");
        Scanner code2 = new Scanner(System.in);
        c2 = code2.nextInt();
        System.out.print("NUMBER 1ST PIECE: ");
        n2 = code2.nextInt();
        System.out.print("VALUE 2ST PIECE: ");
        v2 = code2.nextDouble();

        sum = n1 * v1 + n2 * v2;

        System.out.printf("AMOUNT PAYABLE: $%.2f", sum);

            code1.close();
            code2.close();
    }
}
