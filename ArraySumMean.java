
package com.mycompany.arraysummean;
public class ArraySumMean {
    public static void main(String[] args) {
        double[] numbers = {2.5, 3.7, 4.2, 8.8, 1.9, 6.9, 7.1};
        
        double sum = 0;
        for (double num : numbers) sum += num;
        
        double mean = sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}


