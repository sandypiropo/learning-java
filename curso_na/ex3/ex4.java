package a;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("impossible to divide");
            } else {
                double div = (double) a / b;
                System.out.printf("%.1f\n", div);
            }
        }
        sc.close();
    }
}