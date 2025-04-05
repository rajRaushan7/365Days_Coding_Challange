package Java.Day095;

public class convertUpperToLower {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            // char c = (ch | ' ');
            System.out.print((char)(ch | ' ') + " ");
        }
    }
}