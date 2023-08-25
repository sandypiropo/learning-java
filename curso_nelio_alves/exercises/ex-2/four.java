package ex;

import java.util.Locale;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        double total;

        System.out.print("YOUR NUMBER: ");
        Scanner employeeNumber = new Scanner(System.in);
        int en = employeeNumber.nextInt();

        System.out.print("WORKED HOURS?: ");
        Scanner workedHours = new Scanner(System.in);
        double wh = workedHours.nextDouble();

        System.out.print("VALUE PER HOUR: ");
        Scanner valueHours = new Scanner(System.in);
        double vh = valueHours.nextDouble();

        total = wh * vh;

        System.out.printf("The worker NUMBER = %d, has the salary of: %.2f", en, total);

            employeeNumber.close();
            workedHours.close();
            valueHours.close();

    }
}
