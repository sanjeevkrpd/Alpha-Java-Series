package SelfQuestions;

public class SlidingWindow {

    public static void main(String[] args) {

        int arr[] = {10, 3, 4, 49, 33, 34, 23, 27};

        int current = 0;
        int w = 4;
        for (int i = 0; i < w; i++) {
            current += arr[i];
        }

        int max = current;


        for (int i = 1; i <= arr.length - w; i++) {
            current = current - arr[i - 1] + arr[i + w - 1]; 

            if (max < current) {
                max = current;
            }
        }

        System.out.println(max);
    }
}
