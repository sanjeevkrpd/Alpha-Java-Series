package DailyPractics;

import java.util.Arrays;

public class ProductItself {

    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
    
   
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
    
        // Step 2: Multiply by postfix products
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];
        }
    
        return ans;
    }
    


    public static void productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] ans = new int[n];
    
      
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
    
      
        postfix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }
    

        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * postfix[i];
        }
    
        System.out.println("Result: " + Arrays.toString(ans));
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res[] = productExceptSelf1(arr);

        System.out.println(Arrays.toString(res));
    }
}
