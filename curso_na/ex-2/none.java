package ex;

import java.util.Scanner;

public class none {
    public static void main(String[] args) {

        int choice, alcohol = 0, gasoline = 0, diesel = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("combustive type:\n [1] alcohol\n [2] gasoline\n [3] diesel\n [4] end\n : ");
        choice = sc.nextInt();

        while (choice != 4) {
            if (choice == 1) {
                alcohol += 1;
            }
            else if (choice == 2) {
                gasoline += 1;
            }
            else if (choice == 3) {
                diesel += 1;
            }
            System.out.print(" : ");
            choice = sc.nextInt();
        }
        System.out.printf("THANK YOU\n Alcohol: %d\n Gasoline: %d\n Diesel: %d\n", alcohol, gasoline, diesel);
         sc.close();
    }
}
