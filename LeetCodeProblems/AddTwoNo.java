package LeetCodeProblems;

import java.util.Iterator;
import java.util.LinkedList;

public class AddTwoNo {


    public static void addTwoNumbers(LinkedList l1, LinkedList l2) {


        LinkedList<Integer> l3 = new LinkedList<>();

        int carry = 0;

        


    }


    public static void main(String[] args) {
        
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        
        l1.add(2);
        l1.add(4);
        l1.add(3);



        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer> l3 = new LinkedList<>();
        Iterator<Integer> it1 = l1.iterator(); 
        Iterator<Integer> it2 = l2.iterator();
        int carry = 0;

        while (it1.hasNext() || it2.hasNext() || carry !=0 ) {
        
            int val1 = it1.hasNext() ? it1.next() : 0;
            int val2 = it2.hasNext() ? it2.next() : 0;
            
            int sum = val1 + val2 + carry;

            carry = sum  /10;

            l3.add(sum % 10);

             
        }
        System.out.println(l3);
     

       
    }
}
