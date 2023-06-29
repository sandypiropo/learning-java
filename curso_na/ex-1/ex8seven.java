package opcomparativos;

import java.util.Locale;
import java.util.Scanner;

public class ex8seven {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double x, y;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of the X axis: ");
        x = sc.nextDouble();
        System.out.print("enter the value of the X axis: ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("ORIGIN");
        }
        else if ( x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}
