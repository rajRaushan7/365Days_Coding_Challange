import java.util.*;

public class palendromic_pyramid {
    public static void palendrom(int r){
        if(r == 1){
            System.out.print("1");
        } else{
        for (int i = 1; i <= r; i++) {
            System.out.print(i);
        }
        for (int j = (r-1); j >= 1; j--){
            System.out.print(j);
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        // Print Spaces.....
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }
            palendrom(i);
            System.out.println();
        }
    }
}