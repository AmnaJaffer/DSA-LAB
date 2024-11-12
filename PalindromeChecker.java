
package com.mycompany.palindromechecker;
public class PalindromeChecker {
    public static void main(String[] args) {
        // Array of strings to check for palindromes
        String[] words = {"amna", "cat", "mom", "java", "madam"};

        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
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

    
