import java.io.*;

public class java_prime_check {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int num = Integer.parseInt(n);
        int root = (int) Math.sqrt(num);
        boolean isPrime = true;
        for (int i = 2; i <= root; i++){
            if( num % i == 0 ){
                isPrime = false;
                break;
            }
        }
        if(num == 1) {
            System.out.print("not prime");
        }
        else if(isPrime){
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }
        bufferedReader.close();
    }
}
