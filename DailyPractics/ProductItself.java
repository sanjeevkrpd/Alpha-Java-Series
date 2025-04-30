package DailyPractics;

import java.util.Arrays;

public class ProductItself {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Fill ans[] with left products
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with right products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
