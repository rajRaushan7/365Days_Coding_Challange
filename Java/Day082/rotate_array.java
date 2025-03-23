/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown [nums[k+1], ..., nums[n-1], nums[0], ..., nums[k+1]] (0-indexed).
For example, [0, 1, 2, 4, 5, 6, 7] might be rotated at pibot index 3 and become [4, 5, 6, 7, 0, 1, 2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an alogrithm with O(lon n) runtime complexity.
*/

package Java.Day082;

public class rotate_array {
    public static int IndexOfNum(int numbers[], int target) {  // returns index of target number if it is in the array
        int n = numbers.length;
        int start = numbers[0];
        int end = numbers[n-1];
        while (start <= end){
            int mid = (start + end) / 2; 
            if (numbers[mid] == target) {
                return mid;
            }
            if (numbers[mid] > target) {
                end = mid-1;
                
            } else {
                start = mid + 1;
            }
        }
        return -1 ;
    }

    public static int newIndex(int len, int index, int pivot) {
        int i = index - pivot;
        if(i > 0) {
            return i;
        } else {
            return ((len) - pivot);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {0, 1, 2, 4, 5, 6, 7};
        int pivot = 3; 
        int target = 0;
        int index = IndexOfNum(numbers, target);
        if(index == -1){
            System.out.println(-1);
        } else {
            int newInd = newIndex(numbers.length, index, pivot);
            System.out.println(newInd);
        }
    }
}
 