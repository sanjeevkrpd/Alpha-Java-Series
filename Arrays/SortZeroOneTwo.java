package Problems;

import java.util.Arrays;

public class SortZeroOneTwo {


    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort2(int[] arr){

        int low = 0 , mid = 0, high = arr.length-1;

        while (mid <= high) {
            
            switch (arr[mid]) {
                case 0:
                    swap(arr , low++ , mid++);
                    break;
                case 1:
                mid++;
                break;
                case 2:
                swap(arr , mid , high--);
                default:
                    break;
            }
        }
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     public static void main(String[] args) {
        
        int arr[] = {2,0,1,1,0,1,0,1,2,2};

        sort2(arr);

        System.out.println(Arrays.toString(arr));
     }
}