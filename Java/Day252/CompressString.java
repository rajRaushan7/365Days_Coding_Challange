package Java.Day252;

public class CompressString {

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        StringBuilder newStr = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            char current = str.charAt(i);
            int count = 1;
            i++;

            // consecutive characters count karna
            while (i < str.length() && str.charAt(i) == current) {
                count++;
                i++;
            }

            // character add karo
            newStr.append(current);

            // agar repeat hua hai to uska count bhi add karo
            if (count > 1) {
                newStr.append(count);
            }
        }

        System.out.println("Compressed string : " + newStr.toString());
    }
}