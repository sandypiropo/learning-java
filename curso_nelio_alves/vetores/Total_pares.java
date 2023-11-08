package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Total_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers?: ");
        int number = sc.nextInt();

        int even = 0;
        int[] numberList = new int[number];
        ArrayList<Integer> evenNumber = new ArrayList<>();

        for (int i=0 ; i<numberList.length; i++) {
            System.out.println("Choose a number: ");
            numberList[i] = sc.nextInt();
            if (numberList[i] % 2 == 0) {
                even++;
                evenNumber.add(numberList[i]);
            }
        }

        System.out.println("EVEN NUMBERS: " + evenNumber);
        System.out.println("EVEN TOTAL: " + even);

        sc.close();
    }
}
