public class MissingNumberFinder {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6};
        int[] nums2 = {2, 3, 1, 5};

        findMissingNumber(nums1);
        findMissingNumber(nums2);
    }

    public static void findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);
    }
}