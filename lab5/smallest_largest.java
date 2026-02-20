import java.util.Scanner;

public class smallest_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int smallest = 9;
        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit < smallest)
                smallest = digit;

            if (digit > largest)
                largest = digit;

            num /= 10;
        }

        System.out.println("Smallest Digit = " + smallest);
        System.out.println("Largest Digit = " + largest);
    }
}
