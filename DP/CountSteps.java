package DP;
import java.util.*;
public class CountSteps {


    // memoisation

        public static int  countWays(int n , int ways[]){

            if (n == 0) {
                return 1;
            }
            
            if (n < 0) {
                return 0;
            }

            if (ways[n] != -1) {
                return ways[n];
            }

            ways[n] = countWays(n - 1 ,ways) + countWays(n - 2, ways);
            return ways[n];
        }

        // tabulation

      
        public static int countWaysTab(int n) {

            int dp[] = new int[n+1];
            dp[0]=1;
            dp[1]=1;

            for (int i = 2; i < dp.length; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }

            return dp[n];
        }

    public static void main(String[] args) {
        

        
        int ways[] = new int[8+1];
        // Arrays.fill(ways , -1);

        // System.out.println(countWays(5 , ways));

        System.out.println(countWaysTab(5));
    }
}
