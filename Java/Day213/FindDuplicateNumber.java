package Java.Day213;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number is: " + findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        // Phase 1: Detect the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to the cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

