package DailyPractics;

import java.util.Arrays;

public class NextPermutation {

    public static void findNextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
         
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Step 3: Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        reverse(arr, i + 1, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        
        findNextPermutation(arr);
    }
}
