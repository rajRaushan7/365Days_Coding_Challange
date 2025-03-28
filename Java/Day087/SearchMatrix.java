package Java.Day087;
import java.util.*;

public class SearchMatrix {
    public static void Search(int matrix[][], int key) {
        boolean inMatrix = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    inMatrix = true;
                }
            }
        }
        System.out.println(inMatrix);
    }

    public static void main(String[] args) {
        int[][] matrix = { {4,3,1}, {3,2,4}, {6,4,7} };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        Search(matrix, key);
        sc.close();
    }
}
