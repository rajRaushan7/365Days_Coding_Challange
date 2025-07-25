public class MatrixSortedSearch {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        search(matrix, 9);   // Found
        search(matrix, 15);  // Not found
    }

    public static void search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1; // Start from top-right

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at row " + row + ", column " + col);
                return;
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        System.out.println("Element not found");
    }
}