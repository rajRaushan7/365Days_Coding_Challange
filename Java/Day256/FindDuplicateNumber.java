public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        // Phase 1: Detect intersection point
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entry point of cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums1)); // 2

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums2)); // 3
    }
}