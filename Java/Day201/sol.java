package Java.Day201;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOfRange(nums1, 0, m);

        int i = 0;  
        int j = 0;  
        int k = 0; 

        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[k++] = temp[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[k++] = temp[i++];
        }
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}
