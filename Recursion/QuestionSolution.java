package Recursion;

public class QuestionSolution {

    public static void printOcc(int arr[], int i, int key) {

        // base
        if (i == arr.length) {
            return;
        }

        // kaam

        if (arr[i] == key) {
            System.out.println(i);
        }
        printOcc(arr, i + 1, key);

    }

    public static String getNameOfNo(int n) {
        switch (n) {
            case 1:
                return "one";
            case 2:
                return "two";

            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";

        }

        return "zero";
    }

    public static void converToString(int n) {

        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        converToString(n / 10);

        System.out.print(getNameOfNo(lastDigit) + " ");
    }

    public static int findLength(String str) {

        if (str.length() == 0) {
            return 0;
        }

        return findLength(str.substring(1)) + 1;
    }

    public static int countSubString(String str, int i, int j, int n) {

        if (n == 1) {

            return 1;

        }
        if (n <= 0) {
            return 0;
        }

        int res = countSubString(str, i + 1, j, n - 1) + countSubString(str, i, j - 1, n - 1)
                - countSubString(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(" Transfering dist" + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println(" Transfering dist" + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        // int arr[] = { 3, 2, 4, 5, 6, 2, 4, 2, 2 };
        // printOcc(arr, 0, 2);

        // converToString(2020);

        // converToString(2020);

        // System.out.println(findLength("sanjeev"));

        // String str = "abcab";
        // int n = str.length();
        // System.out.println(countSubString(str, 0, n - 1, n));
        towerOfHanoi(2, "S ", "H", "D");

    }
}
