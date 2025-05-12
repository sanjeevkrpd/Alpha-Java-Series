package DailyPractics;

public class PairSumInRotatedSortedArray {

    public static boolean pairSum(int[] arr, int target) {
        int n = arr.length;

        // Find the pivot (largest element)
        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        // l is index of smallest element
        int l = (i + 1) % n;

        // r is index of largest element
        int r = i;

        // Two pointer approach
        while (l != r) {
            int sum = arr[l] + arr[r];

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                l = (l + 1) % n;
            } else {
                r = (r - 1 + n) % n; // wrap-around
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        if (pairSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
