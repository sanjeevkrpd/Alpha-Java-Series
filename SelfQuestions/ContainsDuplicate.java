package SelfQuestions;

import java.util.HashSet;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] arr){

        HashSet<Integer> s = new HashSet<>();


        for (int i = 0; i < arr.length; i++) {
                
               if (s.contains(arr[i])) {
                    return true;
                }else{
                    s.add(arr[i]);
                }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 3, -4, -14, -25, -12, -5, -3 };


        System.out.println(containsDuplicate(arr));



    }
}
