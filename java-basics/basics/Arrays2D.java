/*
 * 2D Array - An Array where each element is an array
 *            Useful for storing a matrix of data
 */

public class Arrays2D {
    public static void main(String[] args) {

        String[][] groceries = { { "apple", "banana", "kiwi" }, { "potato", "carrot", "cabbage" },
                { "milk", "cheese", "eggs" } };

        groceries[0][0] = "pineapple";
        groceries[1][2] = "onion";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        char[][] telephone = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, { '*', '0', '#' } };

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
