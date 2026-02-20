public class hollow_rectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        // Loop through each row
        for (int i = 1; i <= totRows; i++) {
            // Loop through each column
            for (int j = 1; j <= totCols; j++) {
                // Print star for first row, last row, first column, and last column
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for inner area
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
public static void main(String[] args) {
        hollow_rectangle(3,5);
    }


}
