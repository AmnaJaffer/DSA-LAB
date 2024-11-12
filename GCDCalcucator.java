/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gcdcalcucator;
import java.util.Scanner;

public class GCDCalcucator {
    public static int gcd(int a, int b) {
        // Base case: if the second number becomes 0, a is the GCD
        if (b == 0) return a;

        // Recursive call: pass the remainder of a divided by b as the second parameter
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));
        scanner.close();
    }
}

