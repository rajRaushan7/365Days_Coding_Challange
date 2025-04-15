package Java.Day105;
import java.util.*;

class fibonacci {
    public static int nthFibo(int n) {
        if(n == 1){
            return 0;
        } else if(n == 2){
            return 1;
        }
        return nthFibo(n - 1) + nthFibo(n - 2);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(nthFibo(n));
        s.close();
    }
}
