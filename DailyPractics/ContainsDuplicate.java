package DailyPractics;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    

    public static void main(String[] args) {
        
        HashSet set = new HashSet<>();


      int[] arr =  {1,1,1,3,3,4,3,2,4,2};


      for (int i = 0; i < arr.length; i++) {

         if (set.contains(arr[i])) {
            
            System.out.println("Duplicate Element" + arr[i]);
         }else{
            set.add(arr[i]);
         }
      }

      System.out.println(set);

    }
}
