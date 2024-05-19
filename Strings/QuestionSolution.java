package Strings;

public class QuestionSolution {

    public static String subString(String str, int si, int ei) {

        String s = "";
        for (int i = si; i < ei; i++) {
            s += str.charAt(i);
        }

        return s;
    }

    public static void printLargestString(String fruits[]) {

        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {

            if (largest.compareTo(fruits[i]) < 0) {

                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static String converToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();

    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }

    public static void countVowels(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {

                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        // String str = "Hello World";

        // String s = subString(str, 0, 5);
        // System.out.println(s);

        // String fruits[] = { "apple ", "mango", "banana" };
        // printLargestString(fruits);

        // String s = "hi, my name is sanjeev kumar";

        // System.out.println(converToUppercase(s));

        // String s = "abcd";
        // System.out.println(compressString(s));

        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        String s = "apple";

        countVowels(s);
    }
}
