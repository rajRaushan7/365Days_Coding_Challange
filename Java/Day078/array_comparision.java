// You are given an array and a number 10 if the number is in that array then print index of that number in array, otherwise print -1.
// Use binary search method

public class array_comparision {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) { // left case
                end = mid - 1;
            } else { // right case
                start = mid + 1;    
            }
        }
        return -1;
         
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int ans = binarySearch(numbers, key);
        System.out.println(ans);
    }
}
