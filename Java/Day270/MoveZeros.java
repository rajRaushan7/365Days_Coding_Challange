public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int pos = 0; // position to place next non-zero element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[pos]
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}