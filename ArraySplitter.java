
package com.mycompany.arraysplitter;
import java.util.Arrays;
public class ArraySplitter {
     public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int key = 4;
        
        splitArray(numbers, key);
    }
    
    public static void splitArray(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Key not found in the array.");
            return;
        }
        
        int[] firstPart = Arrays.copyOfRange(arr, 0, index);
        int[] secondPart = Arrays.copyOfRange(arr, index, arr.length);
        
        System.out.println("First part: " + Arrays.toString(firstPart));
        System.out.println("Second part: " + Arrays.toString(secondPart));
    }
}
