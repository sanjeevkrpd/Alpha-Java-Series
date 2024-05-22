package DivideAndConqure;

public class SearchInRotatedSort {

    public static int search(int arr[], int si, int ei, int key) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        // found
        if (arr[mid] == key) {
            return mid;
        }

        // mid on l1

        if (arr[si] <= arr[mid]) {

            // caes a: left
            if (arr[si] <= key && key <= arr[mid]) {
                return search(arr, si, mid - 1, key);
            } else {
                // case b : right
                return search(arr, mid + 1, ei, key);
            }
        }
        // mid on L2

        else {

            // case c
            if (arr[mid] <= key && key <= arr[ei]) {

                return search(arr, mid + 1, ei, key);
            } else {
                // case d
                return search(arr, si, mid - 1, key);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };

        int index = search(arr, 0, arr.length - 1, 0);
        System.out.println(index);
    }
}
