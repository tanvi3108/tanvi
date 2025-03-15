package lecture15;

import java.util.ArrayList;

public class ArrayListsImp {
    public static void main(String[] args) {
        // 1. Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Initial List: " + numbers);

        // 3. Accessing an element
        System.out.println("Element at index 1: " + numbers.get(1));

        // 4. Modifying an element
        numbers.set(1, 25);
        System.out.println("After modification: " + numbers);

        // 5. Removing an element by index
        numbers.remove(0); // Removes first element (10)
        System.out.println("After removing first element: " + numbers);

        // 6. Removing an element by value
        numbers.remove(Integer.valueOf(30)); // Removes 30
        System.out.println("After removing 30: " + numbers);

        // 7. Checking size
        System.out.println("Size of ArrayList: " + numbers.size());

        // 8. Checking if an element exists
        System.out.println("Contains 25? " + numbers.contains(25));

        // 9. Iterating using a for loop
        System.out.println("\nIterating using for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // 10. Iterating using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 11. Converting to an array
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.println(num);
        }

        // 12. Clearing the ArrayList
        numbers.clear();
        System.out.println("After clearing: " + numbers);

        // 13. Checking if empty
        System.out.println("Is list empty? " + numbers.isEmpty());
    }
}
 
