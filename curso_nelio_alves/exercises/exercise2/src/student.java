
public class student {
    private String name;

    public student(String name) {
        this.name = name;
    }

    public Double finalGrade(Double totalPoints) {
       return totalPoints;
    }

    public Double missingPoints(Double totalPoints) {
        double missingPoints = 0.0;
            if (totalPoints < 60) {
            System.out.println("FAILED");
            missingPoints = 60 - totalPoints;
            }
            return missingPoints;
    }

    @Override
    public String toString() {
        return "Student name: " + name;
    }
}
