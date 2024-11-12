package com.mycompany.vectorsum;

import java.util.Vector;

public class VectorSum {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Vector elements: " + numbers);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of Vector elements: " + sum);
    }
}
