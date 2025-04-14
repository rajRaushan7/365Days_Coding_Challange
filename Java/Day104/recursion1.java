package Java.Day104;

public class recursion1 {

    static void printReversedNumbers(int n){
        System.out.print(n + " ");
        if(n == 1){
            System.out.println(1);
        } else{
            printReversedNumbers(n-1);
        }

    }

    public static void main(String[] args){
        printReversedNumbers(20);
    }
}
