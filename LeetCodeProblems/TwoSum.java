package LeetCodeProblems;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = { -1, -1 };

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];


            if (map.containsKey(rem) && map.get(rem) != i) {
                ans[0] = i;
                ans[1] = map.get(rem);
                return ans;
            }
        }

        return ans; 
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

       int ans[] = twoSum(arr, target);

       System.out.println(ans[0]+" "+ans[1]);
    }
}
