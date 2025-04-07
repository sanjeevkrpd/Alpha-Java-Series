package DailyPractics;

import java.util.Arrays;

public class ChocolateDistribution {
    

    public static void main(String[] args) {
        
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int min =3;

        Arrays.sort(arr);
        

        System.out.println(arr[min-1] - arr[0]);
    }

}
