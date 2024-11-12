package com.mycompany.vectormaxsum;

import java.util.Collections;
import java.util.Vector;

public class VectorMaxSum{
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Vector elements: " + numbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of elements: " + sum);

        int maxElement = Collections.max(numbers);
        System.out.println("Maximum element: " + maxElement);
    }
}
