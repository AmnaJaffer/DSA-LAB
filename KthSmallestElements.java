package com.mycompany.kthsmallestelements;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElements
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        Collections.sort(numbers);
        int k = 3;
        System.out.println("Sorted ArrayList: " + numbers);
        System.out.println(k + "-th smallest element: " + numbers.get(k - 1));
    }
}



