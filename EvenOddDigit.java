
package com.mycompany.evenodddigit;
public class EvenOddDigit{ 
    public static void main(String[] args) {
        int number = 123456;
        int evenCount = 0, oddCount = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) evenCount++;
            else oddCount++;
            number /= 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
