package TcsProlems;

public class MissingNoInArray {
    public static void main(String[] args) {

        int arr[] =  {1,2,3,5};
 
        int n = 5;
        int currSum = 0;
        int validSum = (n*(n+1))/2;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
        }
        System.out.println("hello world");
        System.out.println(validSum - currSum);
    }
}
