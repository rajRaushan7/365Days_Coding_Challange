// Given an array of integers, move all the 0s to the end of the array
// while maintaining the relative order of the non-zero elements.

public class shiftAllZeros {

    public static void shiftZero(int[] arr){
        int[] shiftedArr = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                shiftedArr[index] = arr[i];
                index++;
            }
        }
        for(int i = 0; i<shiftedArr.length; i++){
            System.out.print(shiftedArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1, 0, 2, 0, 0, 4, 5};
        shiftZero(arr);
    }
}