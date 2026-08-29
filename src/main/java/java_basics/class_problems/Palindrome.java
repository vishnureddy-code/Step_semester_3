package src.main.java.java_basics.class_problems;

public class Palindrome {

    // 1. Iterative
    static boolean isPalindromeIterative(String text) {

        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        }

        return true;
    }

    // 2. Recursive
    static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1)
            return true;

        if (text.charAt(0) != text.charAt(text.length() - 1))
            return false;

        return isPalindromeRecursive(
            text.substring(1, text.length() - 1)
        );
    }

    // 3. Array reversal
    static boolean isPalindromeArrayReversal(String text) {

        char[] arr = text.toCharArray();

        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--)
            reverse += arr[i];

        return text.equals(reverse);
    }

    public static void main(String[] args) {

        String text = "madam";

        System.out.println("Iterative: " +
            isPalindromeIterative(text));

        System.out.println("Recursive: " +
            isPalindromeRecursive(text));

        System.out.println("Array Reversal: " +
            isPalindromeArrayReversal(text));
    }
}