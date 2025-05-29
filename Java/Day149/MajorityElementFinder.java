package Java.Day149;

public class MajorityElementFinder {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 2, 3, 2, 2};
        int count = 0, candidate = -1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }

        if (count > nums.length / 2) {
            System.out.println(candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}

