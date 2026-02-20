import java.util.*;

public class arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n------ MENU ------");
            System.out.println("1. 1D Array (Max, Min, Avg, Negative Count)");
            System.out.println("2. Remove Duplicates");
            System.out.println("3. Array Rotation");
            System.out.println("4. Second Largest Element");
            System.out.println("5. Matrix Transpose");
            System.out.println("6. Matrix Sum & Difference");
            System.out.println("7. Matrix Multiplication");
            System.out.println("8. Row & Column Sum");
            System.out.println("9. Sum of each 2D layer in 3D array");
            System.out.println("10. Largest element in 3D array");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // 1D Array Operations
                case 1:
                    System.out.print("Enter size: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];

                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    int max = arr[0], min = arr[0], sum = 0, neg = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] > max) max = arr[i];
                        if (arr[i] < min) min = arr[i];
                        if (arr[i] < 0) neg++;
                        sum += arr[i];
                    }

                    System.out.println("Max = " + max);
                    System.out.println("Min = " + min);
                    System.out.println("Average = " + (double) sum / n);
                    System.out.println("Negative Count = " + neg);
                    break;

                //  Remove Duplicates
                case 2:
                    n = sc.nextInt();
                    arr = new int[n];

                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    System.out.println("Without Duplicates:");
                    for (int i = 0; i < n; i++) {
                        boolean dup = false;
                        for (int j = 0; j < i; j++) {
                            if (arr[i] == arr[j]) {
                                dup = true;
                                break;
                            }
                        }
                        if (!dup)
                            System.out.print(arr[i] + " ");
                    }
                    break;

                //  Array Rotation
                case 3:
                    n = sc.nextInt();
                    arr = new int[n];

                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    int k = sc.nextInt();
                    k = k % n;

                    System.out.println("Left Rotation:");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[(i + k) % n] + " ");

                    System.out.println("\nRight Rotation:");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[(i - k + n) % n] + " ");
                    break;

                //  Second Largest
                case 4:
                    n = sc.nextInt();
                    arr = new int[n];

                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    int largest = Integer.MIN_VALUE;
                    int second = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] > largest) {
                            second = largest;
                            largest = arr[i];
                        } else if (arr[i] > second && arr[i] != largest) {
                            second = arr[i];
                        }
                    }

                    System.out.println("Second Largest = " + second);
                    break;

                //  Matrix Transpose
                case 5:
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    int[][] mat = new int[r][c];

                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            mat[i][j] = sc.nextInt();

                    System.out.println("Transpose:");
                    for (int i = 0; i < c; i++) {
                        for (int j = 0; j < r; j++)
                            System.out.print(mat[j][i] + " ");
                        System.out.println();
                    }
                    break;

                // Matrix Sum & Difference
                case 6:
                    r = sc.nextInt();
                    c = sc.nextInt();

                    int[][] a = new int[r][c];
                    int[][] b = new int[r][c];

                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            a[i][j] = sc.nextInt();

                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            b[i][j] = sc.nextInt();

                    System.out.println("Sum:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++)
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        System.out.println();
                    }

                    System.out.println("Difference:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++)
                            System.out.print((a[i][j] - b[i][j]) + " ");
                        System.out.println();
                    }
                    break;

                // Matrix Multiplication
                case 7:
                    int r1 = sc.nextInt();
                    int c1 = sc.nextInt();
                    int r2 = sc.nextInt();
                    int c2 = sc.nextInt();

                    if (c1 != r2) {
                        System.out.println("Multiplication not possible");
                        break;
                    }

                    int[][] m1 = new int[r1][c1];
                    int[][] m2 = new int[r2][c2];
                    int[][] result = new int[r1][c2];

                    for (int i = 0; i < r1; i++)
                        for (int j = 0; j < c1; j++)
                            m1[i][j] = sc.nextInt();

                    for (int i = 0; i < r2; i++)
                        for (int j = 0; j < c2; j++)
                            m2[i][j] = sc.nextInt();

                    for (int i = 0; i < r1; i++)
                        for (int j = 0; j < c2; j++)
                            for (int x = 0; x < c1; x++)
                                result[i][j] += m1[i][x] * m2[x][j];

                    System.out.println("Multiplication Result:");
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++)
                            System.out.print(result[i][j] + " ");
                        System.out.println();
                    }
                    break;

                // 8 Row & Column Sum
                case 8:
                    r = sc.nextInt();
                    c = sc.nextInt();
                    mat = new int[r][c];

                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            mat[i][j] = sc.nextInt();

                    for (int i = 0; i < r; i++) {
                        int rowSum = 0;
                        for (int j = 0; j < c; j++)
                            rowSum += mat[i][j];
                        System.out.println("Row " + i + " Sum = " + rowSum);
                    }

                    for (int j = 0; j < c; j++) {
                        int colSum = 0;
                        for (int i = 0; i < r; i++)
                            colSum += mat[i][j];
                        System.out.println("Column " + j + " Sum = " + colSum);
                    }
                    break;

                //  Sum of each 2D layer in 3D array
                case 9:
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();

                    int[][][] arr3D = new int[x][y][z];

                    for (int i = 0; i < x; i++)
                        for (int j = 0; j < y; j++)
                            for (int k2 = 0; k2 < z; k2++)
                                arr3D[i][j][k2] = sc.nextInt();

                    for (int i = 0; i < x; i++) {
                        int layerSum = 0;
                        for (int j = 0; j < y; j++)
                            for (int k2 = 0; k2 < z; k2++)
                                layerSum += arr3D[i][j][k2];

                        System.out.println("Layer " + i + " Sum = " + layerSum);
                    }
                    break;

                // Largest in 3D
                case 10:
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();

                    arr3D = new int[x][y][z];

                    int largest3D = Integer.MIN_VALUE;

                    for (int i = 0; i < x; i++)
                        for (int j = 0; j < y; j++)
                            for (int k2 = 0; k2 < z; k2++) {
                                arr3D[i][j][k2] = sc.nextInt();
                                if (arr3D[i][j][k2] > largest3D)
                                    largest3D = arr3D[i][j][k2];
                            }

                    System.out.println("Largest Element = " + largest3D);
                    break;

                case 11:
                    System.exit(0);
            }
        }
    }
}
