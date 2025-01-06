package extraprograms;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighestNumberInArray {

    public static void secondHighestNumberUsingSorting(Integer[] numbers) {
        Integer[] arr = numbers;
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers[1]);
    }

    public static void secondHighestNumber(Integer[] numbers) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (max > numbers[j] && secondMax < numbers[j]) {
                secondMax = numbers[j];
            }
        }
        System.out.println("Max= " + max);
        System.out.println("Second Max= " + secondMax);
    }

    public static void main(String[] args) {
        Integer[] arr = {9, 2, 12, 6, 3, 0, 23,66,1};
        secondHighestNumberUsingSorting(arr);
        secondHighestNumber(arr);
    }
}