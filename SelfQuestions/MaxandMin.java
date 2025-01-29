package SelfQuestions;

public class MaxandMin {

    public static void main(String[] args) {
        
        int arr[] = {5,2,3,5,23,5,15};


        int max = arr[0];
        int min = arr[1];


        for (int i = 0; i < arr.length; i++) {
            
            
            if (arr[i] > max ) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
            

        }

        System.out.println("max :" + max);
        System.out.println("min :" + min);
        

    }
}