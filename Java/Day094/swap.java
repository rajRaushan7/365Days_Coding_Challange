// swap tow numbers without using any third variable

package Java.Day094;

public class swap {
    public static void main(String[] args) {
        int a = 15; 
        int b = 17;
        System.out.println("Before Swap");
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap");
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
    }
}