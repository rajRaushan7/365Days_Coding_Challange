package Day222;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking matrix size
        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Taking matrix input
        System.out.println("Enter " + (n * n) + " elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0, secondarySum = 0;

        // Calculating diagonal sums
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i]; // Primary diagonal
            secondarySum += matrix[i][n - i - 1]; // Secondary diagonal
        }

        System.out.println("Sum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);

        sc.close();
    }
}