package Recursion;

public class Solution {

     public static void printDec(int n) {

          // base
          if (n == 1) {
               System.out.println(1);
               return;
          }

          System.out.println(n);
          // smaller function call
          printDec(n - 1);

     }

     public static void printInc(int n) {

          if (n == 1) {
               System.out.println(1);
               return;
          }
          printInc(n - 1);
          System.out.println(n);
     }

     public static double factorial(double n) {

          // base
          if (n == 0) {
               return 1;
          }

          // smaller function
          return n * factorial(n - 1);

     }

     public static int calSum(int n) {

          // base;
          if (n == 1) {
               return 1;
          }

          return n + calSum(n - 1);
     }

     public static int calFibo(int n) {

          // base

          if (n == 0 || n == 1) {
               return 1;

          }

          return calFibo(n - 1) + calFibo(n - 2);
     }

     public static boolean isSorted(int arr[], int i) {

          // base case

          if (i == arr.length - 1) {
               return true;
          }

          if (arr[i] > arr[i + 1]) {
               return false;

          }

          return isSorted(arr, i + 1);
     }

     public static int firstOcc(int arr[], int i, int key) {

          // base case
          if (i == arr.length) {
               return -1;
          }

          if (arr[i] == key) {
               return i;
          }
          return firstOcc(arr, i + 1, key);
     }

     public static int lastOcc(int arr[], int i, int key) {

          // base case
          if (i == arr.length) {
               return -1;
          }
          int isFound = lastOcc(arr, i + 1, key);

          if (isFound == -1 && arr[i] == key) {

               return i;
          }

          return isFound;
     }

     public static int pow(int x, int n) {

          // // base
          // if (n == 0) {
          // return 1;
          // }

          // return x * pow(x, n - 1);

          return (n == 0) ? 1 : x * pow(x, n - 1);
     }

     public static int optimizedPow(int x, int n) {
          if (n == 0) {
               return 1;
          }
          int halfPower = optimizedPow(x, n / 2);
          int halfPowerSq = halfPower * halfPower;

          if (n % 2 != 0) {
               halfPowerSq = x * halfPowerSq;
          }

          return halfPowerSq;
     }

     public static int tilingProblem(int n) {
          if (n == 1 || n == 0) {
               return 1;
          }

          int fnm1 = tilingProblem(n - 1);

          int fnm2 = tilingProblem(n - 2);

          return fnm1 + fnm2;
     }

     public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
          if (idx == str.length()) {
               System.out.println(newStr);
               return;
          }

          char currChar = str.charAt(idx);
          if (map[currChar - 'a'] == true) {
               removeDuplicate(str, idx + 1, newStr, map);
          } else {
               map[currChar - 'a'] = true;
               removeDuplicate(str, idx + 1, newStr.append(currChar), map);
          }
     }

     public static void main(String[] args) {

          // printDec(5);
          // printInc(5);

          // System.out.println(factorial(5));

          // System.out.println(calSum(100));

          // System.out.println(calFibo(10));

          // System.out.println(isSorted(arr, 0));
          // int arr[] = { 5, 3, 4, 5, 3, 32, 4, 5 };

          // System.out.println(firstOcc(arr, 0, 3));

          // System.out.println(lastOcc(arr, 0, 5));

          // System.out.println(pow(5, 4));

          // System.out.println(optimizedPow(2, 10));
          // System.out.println(optimizedPow(2, 5));

          // System.out.println(tilingProblem(4));

          removeDuplicate("appanancollege", 0, new StringBuilder(""), new boolean[26]);
     }

}