public class Utilities {
    private static final int MAX = (int) 1e8;
    private static final boolean[] primeSieve = new boolean[MAX];
    static {
        primeSieve[0] = primeSieve[1] = false;
        for (int p = 2; p < MAX; p++) primeSieve[p] = true;

        for (int p = 2, p_limit = (int) Math.sqrt(MAX); p < p_limit; p++)
            if (primeSieve[p]) for (int i = p * p; i < MAX; i += p) primeSieve[i] = false;
    }

    static void isPrime(int a) {
        System.out.println(a + " is "
                + (primeSieve[a] ? "" : "not ")
                + "a Prime Number.");
    }

    static void isPalindrome(int x) {
        isPalindrome(String.valueOf(x));
    }

    static void isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("It's not a palindrome");
                return;
            }

        System.out.println("Yay! It's a palindrome");
    }

    static void printStars(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) System.out.print('*');
            System.out.println();
        }
    }

    static void printFibonacciSeries(int n) {
        if (n <= 0)     return;
        if (n == 1) {
            System.out.println(0);
            return;
        }

        System.out.print(0 + " " + 1);
        for (int i = 2, a = 0, b = 1; i < n; i++) {
            b = a + b;
            a = b - a;
            System.out.print(" " + b);
        }

        System.out.println();
    }
}
