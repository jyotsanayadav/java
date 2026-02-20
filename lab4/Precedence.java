public class Precedence {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 8, d = 3, e = 5;

        int step1 = c - d;
        System.out.println("c - d = " + step1);

        int step2 = b * step1;
        System.out.println("b * (c - d) = " + step2);

        int step3 = step2 / e;
        System.out.println("(b * (c - d)) / e = " + step3);

        int result = a + step3;
        System.out.println("Final Result = " + result);
    }
}
