package Java.Day248;

import java.util.*;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int count = 0; // index to place non-zero elements

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining with zeros
        while (count < n) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
