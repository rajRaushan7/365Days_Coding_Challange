package Java.Day250;

public class InnerPairWithSum {
    public class PairWithSum {
        public static boolean hasPair(int[] arr, int X) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == X) {
                    return true;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = { 1, 2, 4, 7, 11, 15 };
            int X = 15;

            System.out.println(hasPair(arr, X));
        }
    }
}
