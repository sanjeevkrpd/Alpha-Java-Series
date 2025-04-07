package DailyPractics;

public class MaxandMinElement {


    public static void findMinAndMax(int arr[]){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                
                max=arr[i];
            }else{
                min=arr[i];
            }
           

        }

        System.out.println("Minimum:"+min);
        System.out.println("Maximum:"+max);

    }

    public static void main(String[] args) {
        
        int arr[] = {3, 5, 4, 1, 9};

        // min = 1 && max = 9


        findMinAndMax(arr);
    }
}
