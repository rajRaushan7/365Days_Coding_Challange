package Day227;

public class Reverse {
    public static void main(String args[]){
        int[] arr = {4, 3, 2, 2, 5, 7};
        int start = 0;
        int end = arr.length - 1;
        while(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
