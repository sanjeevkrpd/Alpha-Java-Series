package DailyPractics;

public class MaximumInSubArray {


    public static void findMaxSubArray(int arr[]){

        int maxSum=0;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {


            cs += arr[i];

            if (cs < 0) {
                cs = 0;
            }

            maxSum = Math.max(maxSum, cs);
        }

        System.out.println("maximum in sub array " + maxSum);

    }

    public static void main(String[] args) {
        
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {5,4,-1,7,8};

        findMaxSubArray(nums);
    }
}
