package TcsProlems;

import java.util.Arrays;

public class PushZeroToEnd {

    public static void pushZeroToLast(int arr[]) {
        int n = arr.length;
        int nonZeroIndex = 0;

     
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }


        while (nonZeroIndex < n) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};

        pushZeroToLast(arr);
        System.out.println(Arrays.toString(arr));
    }
}
