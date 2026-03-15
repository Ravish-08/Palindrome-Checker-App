import java.util.Scanner;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Strategy 1: Simple Two-Pointer Algorithm
class SimplePalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Strategy Context
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String str) {
        return strategy.isPalindrome(str);
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Choose algorithm strategy
        PalindromeStrategy strategy = new SimplePalindromeStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.checkPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}