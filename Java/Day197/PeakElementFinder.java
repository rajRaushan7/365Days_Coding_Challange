package Java.Day197;

public class PeakElementFinder {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 20, 4, 1, 0};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};

        System.out.println("Peak in arr1: " + findPeak(arr1));
        System.out.println("Peak in arr2: " + findPeak(arr2));
    }

    public static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            boolean leftOk = (mid == 0 || arr[mid] >= arr[mid - 1]);
            boolean rightOk = (mid == arr.length - 1 || arr[mid] >= arr[mid + 1]);

            if (leftOk && rightOk) {
                return arr[mid];
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }

        return -1;
    }
}
