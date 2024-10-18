package LeetCodeProblems;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int temp[] = new int[arr1.length + arr2.length];
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            
            
                if (arr1[i] < arr2[j]) {
                    
                    temp[k] = arr1[i];
                    i++;
                }else{
                    temp[k] = arr2[j];
                    j++;
                }
                k++;
        }

        while (i < arr1.length) {
            
            temp[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            temp[k] = arr2[j];
            k++;
            j++;
        }

      
        int n = temp.length-1;

        if (n % 2 == 0) {
            
            n = n/2;
            return (double) temp[n];
            
        }else{
                 
            n=n/2;
            return (double) (temp[n+1] + temp[n])/2;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        double ans  = findMedianSortedArrays(arr1, arr2);

        System.out.println(ans);
    }
}
