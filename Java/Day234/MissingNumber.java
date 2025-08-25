public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int N = 5;  // numbers from 1 to N
        
        int totalSum = N * (N + 1) / 2;
        int arrSum = 0;
        
        for (int num : arr) {
            arrSum += num;
        }
        
        int missing = totalSum - arrSum;
        System.out.println("Missing number is: " + missing);
    }
}
