package TcsProlems;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseString {

     public static void main(String[] args) {
        String str = "Hello World";

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            
            s.push(str.charAt(i));
        }
        ArrayList<Character>  list = new ArrayList<>();


        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
     }
}