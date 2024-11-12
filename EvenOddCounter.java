
package com.mycompany.evenoddcounter;

public class EvenOddCounter {
      public static void main(String[] args) {
        int[] numbers = {10,11,12,14,18,20,25};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
