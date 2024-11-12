

package com.mycompany.stringarraylistmenu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringArrayListMenu {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Adding some sample strings to the list
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("watermelon");
        stringList.add("kiwi");
        stringList.add("mango");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Display the largest string");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    displayElements(stringList);
                    break;
                case 2:
                    displayLargestString(stringList);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to display all elements in the ArrayList
    public static void displayElements(ArrayList<String> list) {
        System.out.println("Elements in the list:");
        for (String str : list) {
            System.out.println(str);
        }
    }

    // Method to find and display the largest string by length
    public static void displayLargestString(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        
        String largestString = Collections.max(list, (s1, s2) -> s1.length() - s2.length());
        System.out.println("The largest string is: " + largestString);
    }
}
