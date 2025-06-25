package Java.Day175;


import java.util.*;

public class SubsetSumFinder {

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        System.out.println("Subsets with sum " + target + ":");
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort to handle duplicates
        backtrack(nums, target, 0, new ArrayList<>(), result);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    static void backtrack(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            if (nums[i] > target) break;

            current.add(nums[i]);
            backtrack(nums, target - nums[i], i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}