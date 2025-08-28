package Java.Day237;

public class MoveAllZeroes {
    public static void main(String args[]){
        int[] arr = {0, 1, 9, 0, 12, 0, 5};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                int j = i - 1;
                while (j >= 0){
                    if (arr[j] == 0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        j = j-1;
                        i--;
                    } else {
                        break;
                    }
                }
            }
        }

        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
