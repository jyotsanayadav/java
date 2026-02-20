public class invertedandrotated_half-pyramid {
    public static void invertedandrotated_half_pyramid(int n) {
// Outer loop for each row    
    for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
