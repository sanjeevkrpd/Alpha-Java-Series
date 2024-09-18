package DP;

public class FibonacciSeries {


     //dp->  memoization

    public static int fib(int n , int[] arr){

        if (n==0 || n==1) {
            return n;
        }

        if (arr[n] != 0 ) {
            return arr[n];
        }

        arr[n] = fib(n-1 , arr) + fib(n-2, arr);
        return arr[n];
    }
     //dp->  tabulation


     public static int fibTabulation(int n){

        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
     }

    public static void main(String[] args) {
        

        int n = 10; 
        int arr[] = new int[n+1];
        System.out.println();
        System.out.println(fib(n , arr));
        System.out.println(fibTabulation(n));

    }
}
