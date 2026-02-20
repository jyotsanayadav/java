public class floyd {
    public static void floyds_triangle(int n) {
        int number = 1; // Initialize the starting number - counter
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number after printing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
