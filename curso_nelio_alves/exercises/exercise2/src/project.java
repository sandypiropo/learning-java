import java.util.Locale;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double[] points = new Double[3];
        Double totalPoints = 0.0;

        var student = new student("John");

        for (int i = 0; i < points.length ; i++) {
            System.out.printf("Points on %d Semester: ", i + 1);
            points[i] = sc.nextDouble();
            totalPoints += points[i];

        }

        Double finalGrade = student.finalGrade(totalPoints);
        System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
        if (finalGrade >= 60) {
            System.out.println(student);

            System.out.println("PASS");
        } else {
            Double missing = student.missingPoints(totalPoints);
            System.out.printf("MISSING %.2f POINTS", missing);
        }

        sc.close();

    }
}
