package SelfQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        

        int arr[] = {5,2,3,5,23,5,15};


        int left = 0;
        int right = arr.length-1;
        
        while (left <= right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
