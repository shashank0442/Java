package tobecompleted;

import java.util.ArrayList;

public class ArrayProgramForNegativePositiveNumberSorting {
    // Sprinklr Question: Create an array with input [-1, 2, -3, 4, 5, 6, -7, 8, 9], which output like
    // first number is positive and second is negative if there are more positive or negative
    // numbers then it will be placed at last----> [9, -7, 8, -3, 5, -1, 2, 4, 6]
    public static void main(String[] args) {
        int[] a = {1, 45, 2, -5, -4, -3, -2, -7, 6, 74, 6, 4, 4, 4, 4, 9, 9, 5, 4, 6};

        // Separate positive and negative numbers into two lists
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for (int num : a) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        // Create the output array
        int[] result = new int[a.length];
        int index = 0, posIndex = 0, negIndex = 0;

        // Alternate between positive and negative numbers
        while (posIndex < positives.size() && negIndex < negatives.size()) {
            result[index++] = positives.get(posIndex++);
            result[index++] = negatives.get(negIndex++);
        }

        // Add remaining positive numbers
        while (posIndex < positives.size()) {
            result[index++] = positives.get(posIndex++);
        }

        // Add remaining negative numbers
        while (negIndex < negatives.size()) {
            result[index++] = negatives.get(negIndex++);
        }

        // Print the result array
        for (int num : result) {
            System.out.print(num + " , ");
        }
    }
}
