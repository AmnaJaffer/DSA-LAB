
package com.mycompany.mergedarraymethod;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergedArrayMethod {
    public static void main(String[] args) {
        int[] array1 = {21,22,23,24};
        int[] array2 = {25,26,27,28};
        
        int[] result = mergeAndRemoveDuplicates(array1, array2);
        
        System.out.println("Array after merging and removing duplicates: " + Arrays.toString(result));
    }
    
    public static int[] mergeAndRemoveDuplicates(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}

  
  