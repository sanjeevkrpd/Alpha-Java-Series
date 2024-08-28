package TcsProlems;

// public class TotalNoOfSubArray {


//     public static int countNoOfSubArray(int arr[] , int sum){

//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
            
//             int  totalSum = 0;
//             for (int j = i; j < arr.length; j++) {
                
//                 totalSum += arr[j];
                
//                 if (totalSum == sum) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {


//         int arr[] = {3,4,-7,1,3,3,1,4};
//         int sum = 7;
//         int result = countNoOfSubArray(arr, sum);

//         System.out.println();
//         System.out.println(result);
//     }
// }

import java.util.HashMap;

public class TotalNoOfSubArray {

    public static int countNoOfSubArray(int arr[], int sum) {
      
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int cumulativeSum = 0;
        
      
        map.put(0, 1);

        
        for (int num : arr) {
            cumulativeSum += num;

            if (map.containsKey(cumulativeSum - sum)) {
                count += map.get(cumulativeSum - sum);
            }

      
            map.put(cumulativeSum, map.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4,-7 ,1, 3 ,3, 1, 4};
        int sum = 0;
        int result = countNoOfSubArray(arr, sum);

        System.out.println(result); 
    }
}
