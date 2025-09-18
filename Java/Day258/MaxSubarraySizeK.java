package Day258;

public class MaxSubarraySizeK {
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // slide window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " = " + maxSum(arr, k));
    }
}