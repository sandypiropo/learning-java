package ex;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin;

        System.out.print("Your pin code: ");
        pin = sc.nextInt();

        while (pin != 2002) {
            System.out.println("Invalidate");
            System.out.print("Your pin code: ");
            pin = sc.nextInt();
        }

        System.out.println("WELCOME");
        sc.close();
    }
}
