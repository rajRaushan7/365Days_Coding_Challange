public class StringCompressor {

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // a2b1c5a3
        System.out.println(compress("abc"));         // abc
    }

    public static String compress(String str) {
        if (str == null || str.length() == 0) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character
        compressed.append(str.charAt(str.length() - 1)).append(count);

        // Return the shorter of original or compressed
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}