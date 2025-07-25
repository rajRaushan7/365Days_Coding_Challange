class Solution {

    public class MaxOccuring {
        public int majorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 1;
            for (int i=1; i<nums.length; i++) {
                if(nums[i] == candidate){
                    count++;
                } else {
                    count--;
                }
                if (count == 0){
                    candidate = nums[i];
                    count++;
                }
            }
            return candidate;
        }
    }
}