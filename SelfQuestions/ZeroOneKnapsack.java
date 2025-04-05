package SelfQuestions;

public class ZeroOneKnapsack {


    public static int knapSack(int val[] , int wt[] , int W , int n){
        

        //base case 
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n-1] <= W) {
            //inclue 

            int ans1 = val[n-1]+knapSack(val, wt, W-wt[n-1], n-1);


            //exclude
            int ans2 = knapSack(val, wt, W, n-1);

            return Math.max(ans1, ans2);
        }else{

            return knapSack(val, wt, W, n-1);
        }

    }
    public static void main(String[] args) {
        
        int val[] = {15,14,10,45,30};
        int wt[] ={2,5,1,3,4};
        int W = 7;
        int ans = knapSack(val, wt, W, val.length);

        System.out.println(ans);
    }
}
