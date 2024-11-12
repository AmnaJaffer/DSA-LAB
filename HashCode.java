package com.mycompany.hashcode;

import java.util.Scanner;

public class HashCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Hash code of the input: " + input.hashCode());
        scanner.close();
    }
}
