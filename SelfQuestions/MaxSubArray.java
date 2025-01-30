package SelfQuestions;

public class MaxSubArray {
    

    public static int kadane(int[] arr){

        int cs = 0;
        int ms = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

             cs = cs + arr[i];

             if (cs < 0) {
                cs = 0;
             }

             ms = Math.max(ms, cs);
        }

        return ms;

    }

    public static void main(String[] args) {
        int arr[] = { -20, 3, -4, -14, -25, -12, -5, -3 };


        System.out.println(kadane(arr));
        
    }
}
