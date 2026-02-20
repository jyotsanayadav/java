import java.util.*;
import java.io.*;

public class opp {

    //  Method Overloading
    static class Calculator {

        int calculate(int a, int b) {
            return a + b;
        }

        int calculate(int a, int b, int c) {
            return a + b + c;
        }

        double calculate(double a, double b) {
            return a + b;
        }

        String calculate(String a, String b) {
            return a + b;
        }
    }

    //  Employee
    static class Employee {
        String name;
        int id;
        double salary;

        Employee() {
            name = "Default";
            id = 101;
            salary = 30000;
        }

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void display() {
            System.out.println(name + " " + id + " " + salary);
        }
    }

    //  Counter
    static class Counter {
        static int count = 0;
        int id;

        Counter() {
            count++;
            id = count;
        }
    }

    //  Static vs Instance
    static class TestStatic {
        int x = 10;
        static int y = 20;

        static void show() {
            // System.out.println(x); ❌ Error
            System.out.println("Static variable y = " + y);
        }
    }

    //  Execution Order
    static class ExecutionOrder {

        static {
            System.out.println("Static Block");
        }

        {
            System.out.println("Instance Block");
        }

        ExecutionOrder() {
            System.out.println("Constructor");
        }
    }

    //  Ambiguity
    static class AmbiguityTest {

        void display(int a, float b) {
            System.out.println("int, float");
        }

        void display(float a, int b) {
            System.out.println("float, int");
        }
    }

    //  Static variable demo
    static class Demo {
        int a;
        int b;
        static int c;
    }

    //  Constructor calls method (BufferedReader)
    static class InputClass {
        int value = 0;

        InputClass() throws Exception {
            addValue();
        }

        void addValue() throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter number: ");
            int num = Integer.parseInt(br.readLine());
            value += num;
            System.out.println("Value = " + value);
        }
    }

    //  Default Constructor
    static class DefaultDemo {
        int x; // default 0

        // Uncomment to define your own constructor
        // DefaultDemo() {
        //     x = 100;
        // }
    }

    //  Student with static totalStudents
    static class Student {
        String name;
        int roll;
        static int totalStudents = 0;

        Student() {
            name = "Default";
            roll = 0;
            totalStudents++;
        }

        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
            totalStudents++;
        }
    }

    //  MAIN 
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n----- OOP MENU -----");
            System.out.println("1. Method Overloading");
            System.out.println("2. Employee Constructors");
            System.out.println("3. Counter (Static vs Instance)");
            System.out.println("4. Static Method Access");
            System.out.println("5. Execution Order");
            System.out.println("6. Ambiguity Demo");
            System.out.println("7. Static Variable Effect");
            System.out.println("8. Constructor Calling Method");
            System.out.println("9. Default Constructor Demo");
            System.out.println("10. Student totalStudents");
            System.out.println("11. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Calculator c = new Calculator();
                    System.out.println(c.calculate(2,3));
                    System.out.println(c.calculate(1,2,3));
                    System.out.println(c.calculate(2.5,3.5));
                    System.out.println(c.calculate("Hello ","Java"));
                    break;

                case 2:
                    Employee e1 = new Employee();
                    Employee e2 = new Employee("Ravi",102,50000);
                    e1.display();
                    e2.display();
                    break;

                case 3:
                    Counter o1 = new Counter();
                    Counter o2 = new Counter();
                    Counter o3 = new Counter();
                    System.out.println(o1.id + " " + Counter.count);
                    System.out.println(o2.id + " " + Counter.count);
                    System.out.println(o3.id + " " + Counter.count);
                    break;

                case 4:
                    TestStatic.show();
                    System.out.println("Static method cannot access instance variable directly.");
                    break;

                case 5:
                    ExecutionOrder obj = new ExecutionOrder();
                    break;

                case 6:
                    AmbiguityTest at = new AmbiguityTest();
                    // at.display(10,10); ❌ Ambiguous
                    System.out.println("display(10,10) causes ambiguity.");
                    break;

                case 7:
                    Demo d1 = new Demo();
                    Demo d2 = new Demo();

                    d1.a = 10;
                    d1.b = 20;
                    Demo.c = 50;

                    System.out.println("d2.c = " + d2.c);
                    break;

                case 8:
                    new InputClass();
                    break;

                case 9:
                    DefaultDemo dd = new DefaultDemo();
                    System.out.println("x = " + dd.x);
                    break;

                case 10:
                    Student s1 = new Student();
                    Student s2 = new Student("Aman",101);
                    System.out.println("Total Students = " + Student.totalStudents);
                    break;

                case 11:
                    System.exit(0);
            }
        }
    }
}
