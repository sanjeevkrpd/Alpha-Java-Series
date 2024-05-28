package BackTracking;

import java.util.*;

public class Backtracking {

    public static void changeInArray(int arr[], int i) {

        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = i;
        changeInArray(arr, i + 1); // function
        // backtracking
        if (arr[i] <= 1) {
            arr[i] = -(arr[i] - 2);
        } else {
            arr[i] = arr[i] - 2;
        }

    }

    public static void findSubsets(String str, String ans, int i) {

        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // yes choice

        findSubsets(str, ans + str.charAt(i), i + 1);

        // no choice

        findSubsets(str, ans, i + 1);

    }

    public static void findPermutation(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        // int arr[] = new int[5];

        // changeInArray(arr, 0);
        // System.out.println(Arrays.toString(arr));

        // findSubsets("abc", "", 0);

        findPermutation("abc", "");
    }
}
