package Java.Day249;

public class MatrixArrayProblems {

    // Question1. -> find number of 'target (an integer)' in a 2d array
    public static void noOfTargets(int[][] matrix, int target){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    // Question2. -> find the sum of elements in the second row of a matrix
    public static void sumOf2ndRow(int[][] matrix){
        int sum = 0;
        for(int i=0; i<matrix[1].length; i++){
            sum += matrix[1][i];
        }
        System.out.println(sum);
    }

    // Question3. -> find the transpose of a martix
    public static void transposeOfMatrix(int[][] matrix){
        
    }

    public static void main(String[] args){

    }

}