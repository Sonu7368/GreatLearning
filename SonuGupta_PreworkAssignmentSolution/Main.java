import java.util.Scanner;


public class Main {
    private static final int PALINDROME = 1;
    private static final int STARS      = 2;
    private static final int PRIME      = 3;
    private static final int FIBONACCI  = 4;
    private static final int EXIT       = 0;

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) switch (showMenuAndReturnChoice()) {
            case PALINDROME -> {
                System.out.print("Enter Number: ");
                Utilities.isPalindrome(sc.next());
            }
            case STARS -> {
                System.out.print("Enter Number: ");
                Utilities.printStars(sc.nextInt());
            }
            case PRIME -> {
                System.out.print("Enter Number: ");
                Utilities.isPrime(sc.nextInt());
            }
            case FIBONACCI -> {
                System.out.print("Enter Number: ");
                Utilities.printFibonacciSeries(sc.nextInt());
            }
            case EXIT -> {
                sc.close();
                return;
            }
            default -> System.out.println("Please input a valid choice.");
        }
    }

    private static int showMenuAndReturnChoice() {
        System.out.print(
                "\n" +
                "Enter your choice from below list.\n" +
                "1. Find if a number is palindrome.\n" +
                "2. Print Pattern for a given number.\n" +
                "3. Check whether the no is a  prime number.\n" +
                "4. Print Fibonacci series.\n" +
                "--> Enter 0 to Exit.\n" +
                "Your choice: "
        );

        return sc.nextInt();
    }
}
