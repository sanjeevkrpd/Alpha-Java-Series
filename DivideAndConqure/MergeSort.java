package DivideAndConqure;

import java.util.*;

public class MergeSort {

    public static void mergeSort(int arr[], int st, int ed) {
        if (st >= ed) {
            return;
        }

        int mid = st + (ed - st) / 2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, ed);

        merge(arr, st, mid, ed);
    }

    public static void merge(int arr[], int st, int mid, int ed) {

        int temp[] = new int[ed - st + 1];

        int i = st; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;// iterator for temp;

        while (i <= mid && j <= ed) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // left part

        while (i <= mid) {

            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ed) {
            temp[k++] = arr[j++];
        }
        // copy

        for (k = 0; k < temp.length; k++) {

            arr[k + st] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, 6, 3, 6, 3, 8, 2, 1 };

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
