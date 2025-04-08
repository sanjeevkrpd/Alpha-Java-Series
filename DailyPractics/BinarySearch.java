package DailyPractics;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int searchInRotatedSortArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // If target found at mid
            if (arr[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (arr[start] <= arr[mid]) {
                // If target lies in the left half
                if (target >= arr[start] && target < arr[mid]) {
                    return binarySearch(arr, target, start, mid - 1);
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                // If target lies in the right half
                if (target > arr[mid] && target <= arr[end]) {
                    return binarySearch(arr, target, mid + 1, end);
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 3;

        System.out.println(searchInRotatedSortArray(arr, target));
    }
}
