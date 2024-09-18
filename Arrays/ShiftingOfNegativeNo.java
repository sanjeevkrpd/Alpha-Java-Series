package Arrays;

import java.util.Arrays;

public class ShiftingOfNegativeNo {

    public static void main(String[] args) {
        int[] arr = { -1, 4, 6, -2, 7,-2,-3,-4,-35 };

        // int st = 0;
        // int end = arr.length - 1;

        String str = "sum 45+58+588";

        String numbersOnly = str.replaceAll("[^0-9+]", "");

        String[] numbers = numbersOnly.split("\\+");

        int sum = 0;

        for (String no : numbers) {
            
            sum += Integer.parseInt(no);
        }

        System.out.println("sum is : "+ sum);



     
        // System.out.println();
        // System.out.println(str.length());


        // while (st < end) {

        //     if (arr[st] > 0) {
        //         st++;
        //     }
        //     if (arr[end] < 0) {
        //         end--;
        //     }

        //     if (arr[st] < 0 && arr[end] > 0) {
        //         int temp = arr[st];
        //         arr[st] = arr[end];
        //         arr[end] = temp;

        //     }

        // }
        // System.out.println(Arrays.toString(arr));

    }
}