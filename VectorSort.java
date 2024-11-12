package com.mycompany.vectorsort;

import java.util.Collections;
import java.util.Vector;

public class VectorSort
{
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        Collections.sort(numbers);
        System.out.println("Sorted Vector: " + numbers);

        int largest = Collections.max(numbers);
        System.out.println("Largest number: " + largest);

        int smallest = Collections.min(numbers);
        System.out.println("Smallest number: " + smallest);
    }
}

