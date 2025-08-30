package Java.Day239;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 5};
        int candidate = findCandidate(arr);
        if (isMajority(arr, candidate)) {
            System.out.println("Majority Element is: " + candidate);
        } else {
            System.out.println("No Majority Element found (-1)");
        }
    }
    public static int findCandidate(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }
    public static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}
