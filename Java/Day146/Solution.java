// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int nonZeroIndex = 0;
        
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex++] = arr[i];
            }
        }
        
        while(nonZeroIndex < n) {
            arr[nonZeroIndex++] = 0;
        }
    }
}