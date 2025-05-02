package DailyPractics;

import java.util.HashSet;

public class PairSumInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int target = 16;

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (set.contains(complement)) {
                System.out.println("Pair found: " + arr[i] + " + " + complement + " = " + target);
                found = true;
                break;
            }

            set.add(arr[i]);
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
