package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Question {

    public static boolean containsDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int no : arr) {
            if (set.contains(no)) {
                return true;
            } else {
                set.add(no);
            }
        }

        return false;

    }

    public static int rainWaterTrap(int arr[]) {
        // left most

        int n = arr.length;

        int leftMax[] = new int[n];

        leftMax[0] = arr[0];

        for (int i = 1; i < n; i++) {

            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // right most
        int rightMax[] = new int[n];

        rightMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        // loop and calcualtion

        int trappedRainwater = 0;

        for (int i = 0; i < n; i++) {

            int waterleve = Math.min(leftMax[i], rightMax[i]);

            trappedRainwater += waterleve - arr[i];
        }
        return trappedRainwater;
    }

    public static void triplets(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k]) {

                        int nums[] = new int[3];
                        nums[0] = arr[i];
                        nums[1] = arr[j];
                        nums[2] = arr[k];

                        int sum = nums[0] + nums[1] + nums[2];

                        if (sum == 0) {

                            System.out.println(Arrays.toString(nums));
                        }

                    }
                }

            }
        }
    }

    public static void main(String[] args) {

        // int height[] = { 4, 2, 0, 3, 2, 5 };

        // System.out.println(containsDuplicate(nums));
        // System.out.println(rainWaterTrap(height));

        int nums[] = { -1, 0, 1, 2, -1, -4 };

        triplets(nums);
    }
}
