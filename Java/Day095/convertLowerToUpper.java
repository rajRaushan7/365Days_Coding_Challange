package Java.Day095;

public class convertLowerToUpper {
    public static void main(String[] args) {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char)(ch & '_') + " ");
        }
    }
}
