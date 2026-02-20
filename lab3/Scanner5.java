import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += sc.nextInt();
        }

        double avg = (double) sum / n;

        System.out.println("Average = " + avg);
    }
}
