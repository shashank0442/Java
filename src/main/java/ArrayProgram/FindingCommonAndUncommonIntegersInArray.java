package ArrayProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingCommonAndUncommonIntegersInArray {
    public static int arr[] = {1, 1, 1, 1, 2, 3, 4, 5};
    public static int arr1[] = {9, 1, 2, 3};
    public static List<Integer> list;
    public static Set<Integer> set;

    public static void findingCommonInteger(int arr[], int arr1[]) {
        //To get intersection of both arrays
        list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j] && !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println("Reading list value below");
        for (int val : list) {
            System.out.print(val + "  ");
        }
    }

    public static void findingUncommonInteger(int arr[], int arr1[]) {
        // Getting non common values from Arrays
        set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] != arr1[j] && !list.contains(arr[i])) {
                    set.add(arr[i]);
                }
            }
        }
        System.out.println("Reading set value below");
        for (int val : set) {
            System.out.print(val + " , ");
        }
    }

    public static void main(String[] args) {
        findingCommonInteger(arr, arr1);
        findingUncommonInteger(arr, arr1);

        // Below implementation using Set
        Set<Integer> commonSet = new HashSet<Integer>();
        Set<Integer> uncommonSet = new HashSet<Integer>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int a : arr) {
            set1.add(a);
        }

        for (int b : arr1) {
            set2.add(b);
        }

        for (int value : set1) {
            if (set2.contains(value)) {
                commonSet.add(value);
            } else {
                uncommonSet.add(value);
            }
        }

        for (int value : set2) {
            if (!set1.contains(value)) {
                uncommonSet.add(value);
            }
        }

        System.out.println("Common values are = ");
        for (int i : commonSet) {
            System.out.print(i + " ");
        }

        System.out.println("\n Uncommon values are = ");
        for (int j : uncommonSet) {
            System.out.print(j + " ");
        }

    }
}
