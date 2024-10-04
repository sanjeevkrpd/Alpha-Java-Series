import java.util.Arrays;

public class NoofPairs {
    public static void main(String[] args) {

        int arr1[] = {2, 3, 4, 5};
        int arr2[] = {1, 2, 3};

      
        Arrays.sort(arr2);

        int count = 0;

        for (int no1 : arr1) {
           
            count += countPairs(no1, arr2);
        }

        System.out.println();
        System.out.println("Count of pairs where val1 > val2: " + count);
    }

    
    public static int countPairs(int no1, int[] arr2) {
        if (no1 == 1) {
            return 0; 
        }

        int count = 0;
        
      
        for (int no2 : arr2) {
            if (no2 == 1) {
                count++; 
            } else if (no1 > no2 && no1 <= 3 && no2 >= 2) {
                count++; 
            } else if (Math.pow(no1, no2) > Math.pow(no2, no1)) {
                count++;
            }
        }

        return count;
    }
}
