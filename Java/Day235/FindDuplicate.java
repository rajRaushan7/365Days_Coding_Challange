import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        
        for (int num : arr) {
            if (set.contains(num)) {
                duplicate = num;
                break;
            }
            set.add(num);
        }
        
        System.out.println("Duplicate element is: " + duplicate);
    }
}
