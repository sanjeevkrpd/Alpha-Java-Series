package Arrays;

public class ArrayCC {

    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 50;
        }
    }

    public static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int largest_Number(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    public static int smallest_Number(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // -------------- Binary Search -----------------------//

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // -------------------- Reverse an array -----------------------//

    public static void reverseArr(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            end--;
            start++;
        }
    }

    // ------------------ Pairs in Array ---------------------//

    public static void pairsInArray(int arr[]) {

        int tp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + "," + arr[j] + " )" + " ");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs : " + tp);
    }

    // ------------------ subArray ---------------------//
    public static void subArray(int arr[]) {

        int ts = 0;

        int max_sum = 0;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int start = i;
            for (int j = i; j < arr.length; j++) {

                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {

                    sum += arr[k];
                    System.out.print(arr[k] + " ");

                }
                ts++;
                System.out.println();
                min_sum = Math.min(min_sum, sum);
                max_sum = Math.max(max_sum, sum);

            }

            System.out.println();
        }
        System.out.println("Total SubArrays is : " + ts);
        System.out.println("Maximum SubArray sum is :" + max_sum);
        System.out.println("Minimum SubArray sum is :" + min_sum);
    }

    public static void maxSubArraySum(int arr[]) {

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            int start = i;

            for (int j = i; j < prefix.length; j++) {

                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum Sum is : " + maxSum);

    }

    // ------------------ kadane's Algorithm ------------------------//

    public static void kadane(int arr[]) {

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);

        }
        int min_sum = Integer.MAX_VALUE;
        if (ms <= 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * -1;

                if (min_sum > arr[i]) {
                    min_sum = arr[i];
                }
            }
            System.out.println(min_sum);
        } else {
            System.out.println(ms);
        }

    }

    public static void main(String[] args) {

        // intialization of an array

        // int marks[] = new int[5];

        // marks[0] = 10;
        // marks[1] = 50;
        // marks[2] = 40;

        // // passing array as call by reference

        // update(marks);

        // System.out.println(Arrays.toString(marks));

        // int arr[] = { 10, 25, 68, 72, 85, 99, 126 };
        // int key = 72;

        // int index = binarySearch(arr, key);

        // System.out.println(index);
        // int index = linearSearch(arr, key);

        // if (index == -1) {
        // System.out.println("NO Result Found!");
        // } else {
        // System.out.println("Key Found at index :" + index);
        // }

        // System.out.println("Largest element in array is :" + largest_Number(arr));
        // System.out.println("Smallest element in array is :" + smallest_Number(arr));

        // int arr[] = { 2, 4, 6, 8, 10 };
        // reverseArr(arr);
        // System.out.println(Arrays.toString(arr));

        // pairsInArray(arr);
        // subArray(arr);

        // maxSubArraySum(arr);

        int arr[] = { -20, 3, -4, -14, -25, -12, -5, -3 };

        kadane(arr);

    }
}
