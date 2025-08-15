package Day225;

public class NumberToWords {

    private static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        System.out.println(convertToWords(2025)); // Two Thousand Twenty Five
        System.out.println(convertToWords(504));  // Five Hundred Four
        System.out.println(convertToWords(19));   // Nineteen
    }

    public static String convertToWords(int num) {
        if (num == 0) return "Zero";

        if (num < 20) return ones[num];
        if (num < 100) return tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");
        if (num < 1000) return ones[num / 100] + " Hundred" + (num % 100 != 0 ? " " + convertToWords(num % 100) : "");
        if (num < 10000) return ones[num / 1000] + " Thousand" + (num % 1000 != 0 ? " " + convertToWords(num % 1000) : "");

        return "Number out of range";
    }
}
