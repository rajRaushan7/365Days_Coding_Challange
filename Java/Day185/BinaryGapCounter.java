public class BinaryGapCounter {

    public static void main(String[] args) {
        int n = 529;
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary of " + n + ": " + binary);
        System.out.println("Longest binary gap: " + findBinaryGap(binary));
    }

    public static int findBinaryGap(String binary) {
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                currentGap = 0;
                counting = true;
            } else if (counting) {
                currentGap++;
            }
        }

        return maxGap;
    }
}