package Java.Day108;

public class tiling {
    public static int tilingProb(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fnm1 = tilingProb(n-1);
        int fnm2 = tilingProb(n-2);

        int total = fnm1 + fnm2;
        return total;
    }

    public static void main(String[] args){
        System.out.println(tilingProb(5));
    }
}