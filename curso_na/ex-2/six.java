package ex;

import java.util.Locale;
import java.util.Scanner;

public class six {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        double a, b, c, areat, circle, trap, square, ret, radius, pi;


        System.out.print("First number?: ");
        a = n.nextDouble();
        System.out.print("Second number?: ");
        b = n.nextDouble();
        System.out.print("Third number?: ");
        c = n.nextDouble();

        radius = Math.pow(c, 2);
        pi = 3.14159;

        areat = a * c / 2;
        circle = pi * radius;
        trap =  ((a + b) * c) / 2;
        square = b * b;
        ret = a * b;

        System.out.printf("AREA TRI = %.3f%n CIRCLE = %.3f%n TRAPEZIO = %.3f%n SQUARE = %.3f%n RETANGULO = %.3f%n", areat, circle, trap, square, ret);

        n.close();
    }
}
