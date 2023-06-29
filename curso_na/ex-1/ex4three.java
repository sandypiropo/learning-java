package opcomparativos;

import java.util.Scanner;

public class ex4three {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.print("TYPE TWO NUMBERS: ");
        int A = n.nextInt();
        int B = n.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println(A + " MULTIPLES OF " + B);
        }
        else{
            System.out.println(A + " ARE NOT MULTIPLES OF " + B);
        }

        n.close();
    }
}
