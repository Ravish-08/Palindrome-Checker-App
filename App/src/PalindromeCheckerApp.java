import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}