package com.mycompany.stringoperation;

public class StringOperation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "programming";
        String str5 = "language";

        String concatenated = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Concatenated String: " + concatenated);

        System.out.println("Uppercase of fourth string: " + str4.toUpperCase());

        System.out.println("Substring from 8th position: " + concatenated.substring(8));
    }
}

