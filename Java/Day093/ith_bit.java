package Java.Day093;
import java.util.*;

public class ith_bit {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the nmber: ");
        int n = s.nextInt();
        System.out.print("Enter the value of i: ");
        int i = s.nextInt();
        
        int bitMask = 1 << i;
        int ans = ((n & bitMask) >> i);
        System.out.println((ans));
        s.close();
    }
}


// 9 in binary = 1001
// Bit at index 2 (right to left, 0-based index) = 0
// Bit at index 3 (right to left, 0-based index) = 1