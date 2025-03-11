/*
Given an array of numbers, find the maximum possible sum that can be obtained using its elements.
*/

import java.util.*;

public class max_sub_array {

    public static void maxSubstringSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubstringSum(numbers);
    }
}