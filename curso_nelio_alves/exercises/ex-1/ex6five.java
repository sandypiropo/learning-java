package opcomparativos;

import java.util.Scanner;

public class ex6five {
    public static void main(String[] args) {

        int choice, q;
        double tot, v;


        System.out.println("[1] Hotdog\n[2] X-salad\n[3] X-bacon\n[4] Toast\n[5] Coca");


        Scanner sc = new Scanner(System.in);

        System.out.print("CHOICE / QUANTITY: ");
        choice = sc.nextInt();
        q = sc.nextInt();

        if (choice == 1) {
            v = 4.00;
        } else if (choice == 2) {
            v = 4.50;
        } else if (choice == 3) {
            v = 5.00;
        } else if (choice == 4) {
            v = 2.00;
        } else if (choice == 5) {
            v = 1.50;
        } else {
            System.out.println("Inválido");
            return;
        }

        tot = v * q;

        System.out.println("Total: " + tot);

    }
}
