package Java.Day092;
import java.util.*;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println(n + " is an even number");
        } else if ((n & bitMask) == 1) {
            System.out.println(n + " is an odd number");
        }
    }
}