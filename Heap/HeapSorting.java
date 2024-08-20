package Heap;
import java.util.Arrays;
public class HeapSorting {
    public static void heapSort(int arr[]){
        // Step: Build max heap
        int n = arr.length;

        // Start from the last non-leaf node and move upwards
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }

    public static void heapify(int arr[] ,int i ,int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        // Compare with left child
        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        // Compare with right child
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        // If the largest is not the root, swap and continue heapifying
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, maxIdx, size);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 58, 56, 7, 8, 6, 784, 674};

        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
