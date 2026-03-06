abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary = 50000;

    void calculateSalary() {
        System.out.println("Full Time Employee Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hours = 5;
    int rate = 500;

    void calculateSalary() {
        System.out.println("Part Time Employee Salary: " + (hours * rate));
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}