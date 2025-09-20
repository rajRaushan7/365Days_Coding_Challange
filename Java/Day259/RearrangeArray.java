package Day259;

public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1;
        boolean pickMax = true;
        int index = 0;

        while (left <= right) {
            if (pickMax) {
                temp[index++] = arr[right--];
            } else {
                temp[index++] = arr[left++];
            }
            pickMax = !pickMax;
        }

        // copy back to original
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rearrange(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


