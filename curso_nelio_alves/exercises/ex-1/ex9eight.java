package opcomparativos;

import java.util.Locale;
import java.util.Scanner;

public class ex9eight {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double salary, tax;

        Scanner sc = new Scanner(System.in);
        System.out.print("Your salary: ");
        salary = sc.nextDouble();

        if (salary <= 2000.00) {
            tax = 0.0;
        }
        else if (salary >= 2000.01 && salary <= 3000.00) {
            tax = (salary - 2000.00) * 0.08;
        }
        else if (salary >= 3000.01 && salary <= 4500.00) {
            tax = (salary - 3000.00) * 0.18 + 1000.0 * 0.08;
        }
        else {
            tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
        }

        if (tax == 0.0){
            System.out.println("None income tax");
        }
        else {
            System.out.printf("income tax: R$%.2f", tax);
        }

        sc.close();
    }
}
