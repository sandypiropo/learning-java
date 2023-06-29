package opcomparativos;

import java.util.Scanner;

public class ex3two {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("even or odd: ");
        int number = n.nextInt();

        if (number % 2 == 0) {
            System.out.printf("%d is EVEN", number);
        }
        else {
            System.out.printf("%d is ODD", number);
        }

        n.close();
    }
}
