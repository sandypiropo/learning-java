import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        var employee = new employee("Joana", 6000.00, 1000.00);

        System.out.println(employee.toString());

        System.out.println("Increase percent: ");
        Double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println(employee.toString());
    }
}
