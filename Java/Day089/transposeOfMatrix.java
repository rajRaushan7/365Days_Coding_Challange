public class transposeOfMatrix {

    public static void transpose(int matrix[][]) {
        int transposeMatrix[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] =  { {1,4,9},{11,4,3},{2,2,3}, {5,4,2} };
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Transpose of the Matrix: ");
        transpose(matrix);
    }
}