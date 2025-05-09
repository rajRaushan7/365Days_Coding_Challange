import java.util.ArrayList;
public class Monotonic {
    public static boolean monotonic(ArrayList<Integer> nums){
        int i = 0;
        while(i < nums.size() - 1) {
            if(nums.get(i) > nums.get(i+1)){
                i++;
                while(i < nums.size() - 1) {
                    if(nums.get(i) < nums.get(i+1)) {
                        return false;
                    } else {
                        i++;
                    }
                }
            }
            else if(nums.get(i) < nums.get(i+1)){
                i++;
                while(i < nums.size() - 1) {
                    if(nums.get(i) > nums.get(i+1)){
                        return false;
                    } else {
                        i++;
                    }
                }
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(2); nums.add(3);
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(6); nums2.add(5); nums2.add(4); nums2.add(4);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(7); nums3.add(6); nums3.add(8); nums3.add(5);

        System.out.println(monotonic(nums));
        System.out.println(monotonic(nums2));
        System.out.println(monotonic(nums3));

    }
}