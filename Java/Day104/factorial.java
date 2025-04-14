package Java.Day104;

public class factorial {
    public static int nFactorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * nFactorial(n-1);
    }

    public static void main(String[] args){
        System.out.println(nFactorial(6));
    }
}
