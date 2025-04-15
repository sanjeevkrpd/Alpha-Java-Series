package DailyPractics;

import java.util.Arrays;

public class NextPermutation {

    public static void findNextPermutation(int[] arr) {
       
        //1st step 

        int i = arr.length-2;

        while (i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }
        if (i >= 0) {
            
            int j = arr.length-1;

            while (arr[i] >= arr[j]) {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr, i+1, arr.length-1);

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        
        findNextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
