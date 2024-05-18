package Sorting;

import java.util.Arrays;

public class AllSorting {

    // Bubble Sort O(N^2)

    public static void bubble_sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Selection Sort O(N^2)

    public static void selection_sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }

            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    // insertion sort

    public static void insertion_sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pos = i - 1;

            while (pos >= 0 && arr[pos] > curr) {
                arr[pos + 1] = arr[pos];
                pos--;
            }

            // insertion

            arr[pos + 1] = curr;
        }

        System.out.println(Arrays.toString(arr));
    }

    // cyclic sort
    public static void cyclic_sort(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++; // count frequency
        }

        // sort

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = { 5, 7, 2, 5, 2, 8, 1, 1, 3 };

        // bubble_sort(arr);
        // selection_sort(arr);

        // insertion_sort(arr);
        cyclic_sort(arr);
    }
}
