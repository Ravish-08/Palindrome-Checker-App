
import java.util.Scanner;

import java.util.*;

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input, 0, input.length() - 1)) {
            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {

        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (Character.toLowerCase(front) != Character.toLowerCase(rear)) {


        // Compare dequeue from queue and pop from stack
        while (!queue.isEmpty()) {

            char qChar = queue.remove();  // Dequeue
            char sChar = stack.pop();     // Pop

            if (qChar != sChar) {
        // Continue comparison until pointers cross
        while (start < end) {
            if (chars[start] != chars[end]) {

                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
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