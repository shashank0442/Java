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
            System.out.print(val + " , ");
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
    }
}
