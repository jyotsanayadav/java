public class inverted_half_pyramid_with_numbers {
    public static void inverted_half_pyramid_with_numbers(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }    
}
