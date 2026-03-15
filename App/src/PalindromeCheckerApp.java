
import java.util.Scanner;

// Service class for palindrome checking
class PalindromeService {

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

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (service.isPalindrome(input)) {
            System.out.println("The string is a Palindrome");

        // Result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        // Display result
        if (isPalindrome) 
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original string with reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");

        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}