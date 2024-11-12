
package com.mycompany.uniquecombination;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class UniqueCombination {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 2, 7, 6, 5};
        int target = 8;
        
        List<List<Integer>> combinations = findCombinations(numbers, target);
        
        System.out.println("Combinations that add up to " 
                + target + ": " + combinations);
    }

    public static List<List<Integer>> findCombinations(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(numbers);
        backtrack(result, new ArrayList<>(), numbers, target, 0);
        return result;
    }
    
    private static void backtrack(List<List<Integer>> result, 
            List<Integer> tempList, int[] numbers, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(tempList));
        } else if (remaining > 0) {
            for (int i = start; i < numbers.length; i++) {
                if (i > start && numbers[i] == numbers[i - 1]) continue; // Skip duplicates
                tempList.add(numbers[i]);
                backtrack(result, tempList, numbers, remaining - numbers[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

