public class SecondLargest {
    public static void main(String args[]){

        int[] arr = {4, 3, 2, 4, 2, 5};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int max2 = -1;

        for(int i = 0; i < n; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        for(int j = 0; j < n; j++){
            if(max2 < arr[j] && arr[j] != max){
                max2 = arr[j];
            }
        }

        System.out.println(max2);

    }
}