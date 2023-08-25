package oop;

import java.util.Locale;
import java.util.Scanner;

public class AplicationOOP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double areaX, areaY;

        double[] sidesX = sidesOfTriangle("X");
        double[] sidesY = sidesOfTriangle("Y");

        areaX = areaTriangle(sidesX[0], sidesX[1], sidesX[2]);
        areaY = areaTriangle(sidesY[0], sidesY[1], sidesY[2]);

        resultsAndLargerTriangle(areaX, areaY);

    }

    public static double areaTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void resultsAndLargerTriangle (double areaX, double areaY){
        System.out.printf("Area X = %.4f%n", areaX);
        System.out.printf("Area Y = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Larger area: X = %.3f", areaX);
        } else {
            System.out.printf("Larger area: Y = %.3f", areaY);

        }
    }

    public static double[] sidesOfTriangle(String triangleName){
        Scanner scanner = new Scanner(System.in);
        double[] sides = new double[3];
        System.out.println("Enter the measures of triangle " + triangleName + ": ");
        sides[0] = scanner.nextDouble();
        sides[1] = scanner.nextDouble();
        sides[2] = scanner.nextDouble();
        return sides;
    }
}