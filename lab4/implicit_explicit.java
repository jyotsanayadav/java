public class implicit_explicit {
     public static void main(String[] args) {

        int a = 10;
        double b = a;   // Implicit casting

        System.out.println("Implicit: " + b);

        double x = 10.75;
        int y = (int) x;   // Explicit casting

        System.out.println("Explicit: " + y);
        System.out.println("Loss of precision: " + (x - y));
    }
}
