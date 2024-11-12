package com.mycompany.stringinitialization;
public class StringInitialization {
    public static void main(String[] args) {
        // Using string literals
        String str1 = ("Hello");
        String str2 = ("World");

        // Using new keyword
        String str3 = new String("Hello");
        String str4 = new String("World");

        // Using intern method
        String str5 = new String("Hello").intern();

        // Demonstrating string immutability
        String immutableString = "Immutable";
        immutableString.concat(" Test");

        System.out.println("str1 == str3: " + (str1 == str3));  
        System.out.println("str1 == str5: " + (str1 == str5));  
        System.out.println("Immutable string: " + immutableString);  
    }
}

