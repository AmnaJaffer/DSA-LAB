
package com.mycompany.autoboxing;
import java.util.ArrayList;

public class AutoBoxing{
    public static void main(String[] args) {
        // Autoboxing
        Integer myInt = 100;  // Autoboxing: converting int to Integer
        int myPrimitiveInt = myInt;  // Unboxing: converting Integer to int
        
        System.out.println("Autoboxed Integer: " + myInt);
        System.out.println("Unboxed int: " + myPrimitiveInt);
        
        // Using some wrapper class methods
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Double: " + Double.MIN_VALUE);
    }
}

