package a;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        int tot = 0, totnot = 0, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers to read?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                tot += 1;
            } else {
                totnot += 1;
            }
        }
        System.out.printf("%d IN\n %d OUT", tot, totnot);
    }
}