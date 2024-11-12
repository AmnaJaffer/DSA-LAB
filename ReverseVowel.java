
package com.mycompany.reversevowel;
public class ReverseVowel  {
    public static String reverseVowels(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "AEIOUaeiou";

        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) left++;
            while (left < right && vowels.indexOf(chars[right]) == -1) right--;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed Vowels: " + reverseVowels(input));
    }
}
