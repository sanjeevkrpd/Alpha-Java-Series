package TcsProlems;

import java.util.Arrays;

public class ShiftingOfArray {
    public static void rotateArray(int arr[], int rotate){
        
        int st = 0;
        
        int end = arr.length-1;
        reverse(arr , st , rotate);
        reverse(arr, rotate+1,end);
        reverse(arr,0,end);
        
    }
    
    public static void reverse(int arr[] , int st , int ed){
        while(st <= ed){
           int temp = arr[st];
           arr[st] = arr[ed];
          arr[ed] = temp;
          st++;
          ed--;
        }
    }
    
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    
    }

     public static void main(String[] args) {
       
       
       int arr[] = {1,2,3,4,5,6,7};
       int r = 3;
       
       while(r > 0){
           
           int first = arr[0];
           
           for(int i = 1 ;i < arr.length;i++){
               arr[i-1] = arr[i];
           }
           arr[arr.length-1] = first;
           
           r--;
       }
       
       
       System.out.print(Arrays.toString(arr));
       
       
    }

}
