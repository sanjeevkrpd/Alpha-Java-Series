package GeeksForGeeks;

class IndexsOfSum {
    
    public static void findSubarrayWithSum(int[] arr, int targetSum) {
        int n = arr.length;
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

          
            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

         
            if (currentSum == targetSum) {
                
                System.out.println((start + 1) + " " + (end + 1));
                return; 
            }
        }

      
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 105;

        findSubarrayWithSum(arr, sum);
    }
}
