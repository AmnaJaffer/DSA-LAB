
package com.mycompany.mathoperation;
public class MathOperation {
    public static void main(String[] args) {
        int number = -16;
        double squareRoot = Math.sqrt(Math.abs(number));
        double power = Math.pow(2, 3);

        System.out.println("Absolute value: " + Math.abs(number));
        System.out.println("Square root: " + squareRoot);
        System.out.println("2^3: " + power);
    }
}


