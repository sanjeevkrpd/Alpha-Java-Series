package SelfQuestions;

import java.util.Arrays;

public class ChocolateDistribution {

    public static int chocolateDistribution(int arr[], int m) {
      
        if (arr.length == 0 || m == 0) {
            return 0;
        }


        if (arr.length < m) {
            return -1; 
        }

        Arrays.sort(arr);

        
        int minDiff = Integer.MAX_VALUE;

    
        for (int i = 0; i <= arr.length - m; i++) {
            int currentDiff = arr[i + m - 1] - arr[i]; 
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3; 

        int result = chocolateDistribution(arr, m);
        System.out.println("Minimum difference is: " + result);
    }
}