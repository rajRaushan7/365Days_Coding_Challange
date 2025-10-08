package Day273;

import java.util.Arrays;

public class ClosestPairSum {
    public static int twoSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int closestSum = nums[left] + nums[right];
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
            }
            
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return sum; // perfect match
            }
        }
        
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println("Closest Sum: " + twoSumClosest(nums, target));
    }
}
