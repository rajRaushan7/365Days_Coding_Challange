import java.util.*;

public class revNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a numver: ");
        int n = s.nextInt();
        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n /10;
        }

        System.out.println("It's reverse is: " + rev);

        s.close();
    }
}
