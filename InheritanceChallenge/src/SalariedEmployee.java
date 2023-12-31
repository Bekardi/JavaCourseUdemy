public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(
            String name,
            String birthDate,
            String hireDate,
            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        return (int) annualSalary/26;
    }

    public void retire() {
        terminate("2025-12-12");
        isRetired = true;
    }
}
