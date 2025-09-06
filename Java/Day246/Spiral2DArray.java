package Java.Day246;

public class Spiral2DArray {

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length -1;

        while(startRow <= endRow && startCol <= endCol){
            // top 
             for(int j=startCol; j<endCol; j++){
                System.out.print(matrix[startRow][j] + " ");  
             }
            // right
            for(int i = startRow; i<endRow; i++){
                System.out.print(matrix[i][endRow] + " ");
            }
            // bottom
            for(int l = endCol; l>startCol; l--){
                System.out.print(matrix[endRow][l] + " ");
            }
            // left
            for(int k = endRow; k > startRow; k--){
                System.out.print(matrix[k][startRow] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }

    public static void main(String[] args){
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(arr);

    };


    
}