
package com.mycompany.arraymerged;
import java.util.Arrays;
public class ArrayMerged {

    public static void main(String[] args) {
        int[] baseArray = {10,11,12,13};
        int[] newArray = {14,15,16,17};
        
        int[] mergedArray = mergeArrays(baseArray, newArray);
        
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}

