package Strings;

import java.util.*;

public class AnagramString {

    public static boolean anagramString(String str1, String str2) {

        str1.toLowerCase();
        str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char str1array[] = str1.toCharArray();
            char str2array[] = str2.toCharArray();

            Arrays.sort(str1array);
            Arrays.sort(str2array);

            boolean result = Arrays.equals(str1array, str2array);
            if (result) {
                return true;
            } else {
                return false;
            }

        } else {
            System.out.println(" 1st string length " + str1 + " 2nd string length " + str2 + " are not same ");
            return false;
        }

    }

    public static void main(String[] args) {

        String str1 = "pankaj";
        String str2 = "baskey";

        System.out.println(anagramString(str1, str2));

    }
}
