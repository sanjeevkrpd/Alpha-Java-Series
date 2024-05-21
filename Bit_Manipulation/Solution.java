package Bit_Manipulation;

public class Solution {

    public static void swap(int a, int b) {

        System.out.println("Before swap a :" + a);
        System.out.println("Before swap b :" + b);

        System.out.println();

        // a = 5; b=10; -> a=10 b =5;
        // a = a + b;
        // b = a - b;
        // a = a - b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap a :" + a);
        System.out.println("After swap b :" + b);

    }

    public static void main(String[] args) {

        // System.out.println(4 ^ 4);

        // swap(5, 10);
        // swap(13, 140);

        // System.out.println(-(~5));

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println((char) (ch | ' '));
        }

    }

}
