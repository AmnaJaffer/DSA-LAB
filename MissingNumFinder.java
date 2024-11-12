
package com.mycompany.missingnumfinder;
public class MissingNumFinder {
    public static void main(String[] args) {
        int[] numbers = {0,1,3,4,5};
        int missingNumber = findMissingNumber(numbers);
        
        System.out.println("The missing number is: " + missingNumber);
    }
    
    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : numbers) actualSum += num;
        
        return expectedSum - actualSum;
    }
}

