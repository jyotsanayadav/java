public class sum_of_digits {
     public static void main(String[] args) {

        int num = 1234;

        int sum = (num % 10) +
                  ((num / 10) % 10) +
                  ((num / 100) % 10) +
                  ((num / 1000) % 10);

        System.out.println("Sum of digits = " + sum);
    }
}
