interface Calculator {
    void add(int a, int b);
    void subtract(int a, int b);
}

class SimpleCalculator implements Calculator {

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}
public class InterfaceCalculator {
    public static void main(String[] args) {

        SimpleCalculator sc = new SimpleCalculator();

        sc.add(10, 5);
        sc.subtract(10, 5);
    }
}