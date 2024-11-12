
package com.mycompany.arrayswap;
import java.util.Arrays;
public class ArraySwap {

    public static void main(String[] args) {
        int[] array1={1,2,3,4};
        int[] array2={10,83,7,6};
        System.out.println("before swapping");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));


        //swapping
        for(int i=0;i<array1.length;i++){
            int temp=array1[i];
            array1[i]=array2[i];
            array2[i]=temp;
        }
        // after swapping
        System.out.println("after swapping");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));    
        
    }
}
