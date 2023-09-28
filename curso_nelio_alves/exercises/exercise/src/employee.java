public class employee {
    private String name;
    private Double grossSalary;
    private Double tax;

    public employee(String name, Double grossSalary, Double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public Double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(Double percentage) {
        double percent = 1 + (percentage / 100);

        double newSalary = this.grossSalary * percent;

        double salaryIncrease = newSalary - this.grossSalary;

        this.grossSalary = newSalary; // Atualiza o valor bruto

        System.out.printf("Increase of: %.2f", salaryIncrease);
        System.out.printf("\nUpdate data: %s $ %.2f", this.name, this.grossSalary);
    }

    @Override
    public String toString() {
        return "\nemployee " +
                "Name = " + name + '\n' +
                "Gross Salary = $%.2f".formatted(grossSalary) + '\n' +
                "Net Salary = $%.2f".formatted(netSalary());
    }
}