// Sort an array ([5, 4, 1, 3, 2]) using bubble sort method

// import java.util.*;

public class array_sort {
    public static void bubbleSort(int nums[]) {
        for (int turn = 0; turn < nums.length-1; turn++) {
            for (int j = 0; j < nums.length-1-turn; j++){
                if(nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}