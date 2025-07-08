package Java.Day189;

public class NumberToWords {

    static String[] belowTen = {
        "", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine"
    };

    static String[] belowTwenty = {
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
        "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        int number = 1005;
        if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println(convert(number).trim());
        }
    }

    public static String convert(int num) {
        if (num < 10) return belowTen[num];
        else if (num < 20) return belowTwenty[num - 10];
        else if (num < 100) return tens[num / 10] + " " + convert(num % 10);
        else if (num < 1000) return belowTen[num / 100] + " hundred " + convert(num % 100);
        else if (num <= 9999) return belowTen[num / 1000] + " thousand " + convert(num % 1000);
        return "";
    }
}
