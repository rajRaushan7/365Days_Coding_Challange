// [
//     [a, b, c],
//     [d, e, f],
//     [g, h, i]
// ]
// Create this Martix in 2-D Array

package Java.Day087;
import java.util.*;

public class twoD_Array {
    public static void main(String[] args) {
        char matrix[][] = new char [3][3];
        int n = 3, m = 3;
        char c = 'a';

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                matrix[i][j] = c;
                c++;
            }
        }
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
