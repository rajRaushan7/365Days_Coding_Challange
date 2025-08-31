package Java.Day240;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int[] result = new int[n];
        
        int left = 0, right = n - 1;
        int index = 0;

        while (left <= right) {
            if (index % 2 == 0) {
                result[index++] = arr[right--];
            } else {
                result[index++] = arr[left++]; 
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
