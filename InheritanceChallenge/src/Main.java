public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Beka", "1999-01-07", "2018-02-01");
        SalariedEmployee employee2 = new SalariedEmployee("Zeynep", "2003-04-25", "2018-02-01",35000);
        employee.getAge();
        employee2.getAge();
        System.out.println(employee);
        System.out.println(employee2);
        System.out.println("Zeynep's paycheck = $" + employee2.collectPay());
        }
    }