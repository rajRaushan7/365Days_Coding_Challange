package Day147;

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int indx = d % arr.length;
        int[] newArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            newArr[i] = arr[indx];
            if(indx == arr.length - 1){
                indx = 0;
            } else{
                indx++;
            }
        }
        
        System.arraycopy(newArr, 0, arr, 0, newArr.length);
    }
}