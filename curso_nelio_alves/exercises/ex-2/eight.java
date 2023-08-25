package ex;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {

        double x, y, coordinate = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("write the cordenate x: ");
        x = sc.nextDouble();
        System.out.print("write the cordenate y: ");
        y = sc.nextDouble();

        while ( x != 0.0 && y != 0.0) {
            if (x > 0.0 && y > 0.0) {
                System.out.println("first Quadrante");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("second Quadrant");
            } else if (x < 0.0 && y < 0.0) {
                System.out.println("thirth Quandrant");
            } else if (x > 0.0 && y < 0.0) {
                System.out.println("fourth Quadrant");
            }
            System.out.print("write the cordenate x: ");
            x = sc.nextInt();
            System.out.print("write the cordenate y: ");
            y = sc.nextInt();
        }
    sc.close();
    }
}
