public class repeating_no_in_array {

    public static boolean checkRepeat(int numbers[], int n, int index) {
        for(int i = (index + 1); i < numbers.length; i++) {
            if (n == numbers[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean ans1 = false;
        boolean ans2 = false;
        int num1[] = {1, 2, 3, 1};
        int num2[] = {1, 2, 3, 4};
        for(int i = 0; i < (num1.length - 1); i++) {
            if(checkRepeat(num1, num1[i], i)) {
                ans1 = true;
            }
        }
        for(int i = 0; i < (num2.length - 1); i++) {
            if(checkRepeat(num2, num2[i], i)) {
                ans2 = true;
            }
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
}