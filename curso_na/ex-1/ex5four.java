package opcomparativos;

import java.util.Scanner;

public class ex5four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("START: ");
        int Start = sc.nextInt();

        System.out.print("END: ");
        int End = sc.nextInt();

        int tot;

            if (End > Start) {
            tot = End - Start;
        }
        else {
            tot = (24 - Start) + End;
        }

        System.out.println("Game duration was " + tot + " hours");
        sc.close();
    }
}
