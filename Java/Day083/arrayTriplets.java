/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, j != k, and nums[i] + nums[j] + nums[k] == 0.
*/
package Java.Day083;
import java.util.Arrays;
public class arrayTriplets {
    public static void triplets(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 1; k < nums.length; k++) {
                    if(i != j && i != k && j != k) {
                        if(nums[i] + nums[j] + nums[k] == 0) {
                            int ans[] = {nums[i], nums[j], nums[k]};
                            System.out.println(Arrays.toString(ans));
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplets(nums);
    }
}
