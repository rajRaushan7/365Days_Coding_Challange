package Java.Day199;

public class SubarraySum {
    public static void maxAndMinSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int s2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                s2 = 0;
                for (int k = i; k <=j; k++){
                    s2 += arr[k];
                }
                System.out.println(s2);
                if(s2 > max) {
                    max = s2;
                }
                if(s2 < min) {
                    min = s2;
                }
            }
        }
        System.out.println("Maximum subarray sum : " + max);
        System.out.println("Minimum subarray sum : " + min);
    }
     public static void main(String args[]) {
        int[] arr = {1, -2, 6, -1, 3};
        maxAndMinSum(arr);
    }
}
