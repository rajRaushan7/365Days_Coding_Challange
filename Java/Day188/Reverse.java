package Java.Day188;
import java.util.Stack;
import java.util.*;

public class Reverse {

    public static String reverseString(String str) { 
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()){
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Reversed String : " + reverseString(str));
        s.close();
    }
}