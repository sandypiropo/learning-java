package ex;

import java.util.Locale;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.print("Enter the radius of the circle: ");
        Scanner num = new Scanner(System.in);

        double radius, area, pi = 3.14159;

        double n = num.nextDouble();

        radius = Math.pow(n, 2);
        area = pi * radius;

        System.out.printf("RESULT = %.4f%n", area);

        num.close();
    }
}
