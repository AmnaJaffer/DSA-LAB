

package com.mycompany.longestword;
public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String sentence = "Java programming is fun";
        System.out.println("Longest Word: " + findLongestWord(sentence));
    }
}
