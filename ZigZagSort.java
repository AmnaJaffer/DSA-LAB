
package com.mycompany.zigzagsort;
import java.util.Arrays;

public class ZigZagSort {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 7, 8, 6, 2, 1};
        zigzagSort(numbers);
        
        System.out.println("Array in Zigzag pattern: " + Arrays.toString(numbers));
    }
    
    public static void zigzagSort(int[] arr) {
        boolean less = true;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (less) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            less = !less;
        }
    }
}

