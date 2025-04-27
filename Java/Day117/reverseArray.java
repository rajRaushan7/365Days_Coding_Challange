package Java.Day117;

public class reverseArray {

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        printArr(arr);
        int[] revArray = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i>= 0; i--){
            revArray[j] = arr[i];
            j++;
        }
        printArr(revArray);
    }
}