
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array - a collection of values of same data type
        // * a variable that can store more than 1 value *

        // String[] fruits = { "apple", "orange", "banana", "papaya" };

        // fruits[0] = "pineapple";

        // int numOfFruits = fruits.length;
        // System.out.println("length: " + numOfFruits);

        // Arrays.sort(fruits); // sort array
        // Arrays.fill(fruits, "pineapple"); // fill all the value as pineapple

        // for (int i = 0; i < fruits.length; i++) {
        // System.out.print(fruits[i] + " ");
        // }

        // Enhanced for loop
        // for (String fruit : fruits) {
        // System.out.print(fruit + " ");
        // }

        // System.out.println(fruits); // memory address
        // System.out.println(fruits[0]); // pineapple

        // user input for foods array

        // String[] foods = new String[3]; // empty array with space for 3 element

        // for (int i = 0; i < foods.length; i++) {
        // System.out.print("Enter the food : ");
        // foods[i] = scanner.nextLine();
        // }

        // for (String food : foods) {
        // System.out.print(food + " ");
        // }

        // SEARCH an Array

        // int[] nums = { 1, 2, 3, 4, 8, 9 };
        // int target = 2;

        // for (int i = 0; i < nums.length; i++) {
        // if (target == nums[i]) {
        // System.out.println("Element is at target : " + i);
        // isFound = true;
        // break;
        // }
        // }

        String[] fruits = { "banana", "apple", "kiwi", "orange" };
        String fruit;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for?: ");
        fruit = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(fruit)) {
                System.out.println("Fruit found at index : " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element doesn't exist in array");
        }

        scanner.close();
    }
}
