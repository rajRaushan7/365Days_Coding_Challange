package Java.Day187;

import java.util.*;

public class LuckyNumbersInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        List<Integer> luckyNumbers = findLuckyNumbers(matrix);

        if (luckyNumbers.isEmpty()) {
            System.out.println("No lucky numbers found.");
        } else {
            for (int num : luckyNumbers) {
                System.out.println("Lucky number found: " + num);
            }
        }
    }

    public static List<Integer> findLuckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            // Find min element in row i
            int minInRow = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if it's the max in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                result.add(minInRow);
            }
        }

        return result;
    }
}