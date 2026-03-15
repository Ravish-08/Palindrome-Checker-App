
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Two Pointer Method
    public static boolean twoPointerPalindrome(String str) {

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

    // Recursive Method
    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase().replaceAll("\\s+", "");

        // Two Pointer Performance
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();

        // Recursive Performance
        long start2 = System.nanoTime();
        boolean result2 = recursivePalindrome(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Time Taken: " + (end1 - start1) + " ns");

        System.out.println("Recursive Result: " + result2);
        System.out.println("Time Taken: " + (end2 - start2) + " ns");

        sc.close();
    }
}