
import java.util.Scanner;
import java.util.LinkedList;

import java.util.*;


public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }
        // Ask user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine()


        Deque<Character> deque = new ArrayDeque<>();

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