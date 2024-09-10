package Graphs;

import java.util.Stack;

public class SecondLargestElement {




    public static void reverseString(String str){

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }


    public static void main(String[] args) {
        
        // int arr[] = {3,5,6,78,9,4,54,6,5,8};


        // int max1 = arr[0];
        // int max2 = Integer.MIN_VALUE;

        // for (int i = 1; i < arr.length; i++) {
            
        //      if (max1 < arr[i]) {
        //         max2 = max1;
        //         max1 = arr[i];
        //      }else if(max2 < arr[i]){
        //         max2 = arr[i];
        //      }
        // }
        // System.out.println("First largest element : " + max1);
        // System.out.println("Second largest element : " + max2);

        System.out.println();
        reverseString("sanjeev");
    }
}
