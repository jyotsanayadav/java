import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Prime Check");
            System.out.println("2. Factorial");
            System.out.println("3. Reverse Number");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int num = sc.nextInt();
                    boolean isPrime = true;
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(isPrime ? "Prime" : "Not Prime");
                    break;

                case 2:
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++)
                        fact *= i;
                    System.out.println("Factorial = " + fact);
                    break;

                case 3:
                    int number = sc.nextInt();
                    int rev = 0;
                    while (number > 0) {
                        rev = rev * 10 + number % 10;
                        number /= 10;
                    }
                    System.out.println("Reverse = " + rev);
                    break;
            }

        } while (choice != 4);
    }
}
