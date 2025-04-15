package DailyPractics;

import java.util.Arrays;
import java.util.HashSet;

public class RepeatAndMissingNumber {

    public static int[] findMissingAndRepeat(int[] arr) {

        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int repeat = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                repeat = arr[i];
            } else {
                set.add(arr[i]);
                actualSum += arr[i];
            }
        }

        int missing = expectedSum - actualSum;

        return new int[] { repeat, missing };
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 3 };
        // 1 + 2 + 3 + 3 + 5  // n(n+1)/2 => 5 (5+1)/2 => 30/2 => 15;
        // 3, 1, 2, 5, 3 => 1+2+3+5=11 => actual - current = 15 -14 = 4;
        int[] ans = findMissingAndRepeat(arr);

        System.out.println(Arrays.toString(ans)); 
    }
}
