package TcsProlems;

public class RearrangeArrayAlternate {
    public static void main(String[] args) {
       // int[] arr = {1, 2, 3, 4, 5,6};
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110};


        int i=0;
        int j=arr.length-1;

        while (i <= j) {
            
            System.out.print(arr[j] + " ");
            System.out.print(arr[i] + " ");
            i++;
            j--;
        }

    }
}
