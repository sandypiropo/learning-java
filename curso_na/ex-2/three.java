package ex;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        int A, B, C, D, dif;

        System.out.println("DIGIT 4 NUMBERS");
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        dif = A * B - C * D;

        System.out.println("DIFFERENCE = " + dif);

            sc.close();
    }
}
