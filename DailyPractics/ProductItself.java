package DailyPractics;

import java.util.Arrays;

public class ProductItself {

    public static int[] productExceptSelf(int[] nums) {
        int newArr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            newArr[i] = multiply(nums,i);
        }
        return newArr;
    }

    public static int multiply(int[] arr , int idx){
        
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            
            if (i != idx) {
                mul *= arr[i];
            }else{
                continue;
            }
      
        }
        return mul;
    }
    public static void main(String[] args) {
     
        int arr[] = {-1,1,0,-3,3};

       System.out.println(Arrays.toString(productExceptSelf(arr)));

        

    }
    // public static int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] result = new int[n];

    //     // Step 1: Left product pass
    //     result[0] = 1;
    //     for (int i = 1; i < n; i++) {
    //         result[i] = result[i - 1] * nums[i - 1];
    //     }

    //     // Step 2: Right product pass
    //     int right = 1;
    //     for (int i = n - 1; i >= 0; i--) {
    //         result[i] = result[i] * right;
    //         right *= nums[i];
    //     }

    //     return result;
    // }
}
