package Java.Day191;

public class PrimeDiamondPattern {

    public static void main(String[] args) {
        int n = 3;
        int totalRows = 2 * n - 1;
        int totalNumbers = (n * n); // Number of primes needed for diamond
        int[] primes = generateNPrimes(totalNumbers);

        int index = 0;

        // Upper half
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            for (int j = 0; j < i; j++) {
                System.out.print(primes[index++] + " ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);
            for (int j = 0; j < i; j++) {
                System.out.print(primes[index++] + " ");
            }
            System.out.println();
        }
    }

    // Generate first n prime numbers
    public static int[] generateNPrimes(int n) {
        int[] primes = new int[n];
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primes[count++] = num;
            }
            num++;
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}