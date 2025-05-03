// Given a binary array (containing only 0s and 1s), find the maximum number of consecutive 1s in the array.

// package Java.Day123;

public class countOne {
    public static void main(String[] args){
        int count = 0;
        int[] arr = {1, 1, 0, 1, 1, 1};
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            } else{
                count = 0;
            }
        }
        System.out.println(count);
    }
}
