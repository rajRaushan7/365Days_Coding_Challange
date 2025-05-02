// Write a Java program to count the number of vowels and consonants in a given lowercase English string.
// (Assume the input will contain only lowercase letters and no spaces or special characters)

package Java.Day122;

public class letterCount {
    public static void main(String[] args){
        int v = 0; 
        int c = 0;
        String word = "developer";
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;
            } else if(ch >= 97 && ch <= 122){
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonents: " + c);
    }
}