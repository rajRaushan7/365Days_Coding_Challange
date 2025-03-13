// java.util.*;

public class max_substring {

    public static void maxSum(int numbers[]) {
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = numbers[i] + prefix[i-1];
        }

        int max = Integer.MIN_VALUE;
        int current = 0;

        for(int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                current = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(current > max) {
                    max = current;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSum(numbers);
    }
}