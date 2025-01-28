package SelfQuestions;

public class FiboQuestionSolutionDp {


    public static int fib(int no , int dp[]){

        if(no == 0 || no == 1){
            return no;
        }

        if (dp[no] != 0) {
            return dp[no];
        }


        dp[no] = fib(no-1 ,dp) + fib(no-1,dp);

        return dp[no];
    }
    public static void main(String[] args) {
        int f = 5 ;

        int dp[] = new int[f+1];
        System.out.println(fib(f , dp));
    }
}
