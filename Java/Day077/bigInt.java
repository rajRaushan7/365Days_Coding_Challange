import java.math.*;
import java.util.*;

public class bigInt {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.print(a.multiply(b));
        sc.close();
    }
}