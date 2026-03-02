class Person {
    String name = "Jyotsana";

    void getDetails() {
        System.out.println("Person Name: " + name);
    }
}

class Employee extends Person {
    int salary = 30000;
    void getDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "IT";
    void getDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Person p = new Manager();   
        p.getDetails();            
    }
}