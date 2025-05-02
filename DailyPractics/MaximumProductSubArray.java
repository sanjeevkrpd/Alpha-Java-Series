package DailyPractics;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i] , currMin * nums[i] ));

            maxProduct = Math.max(currMax , maxProduct);
        }

        System.out.println(maxProduct);
       
    }
}

