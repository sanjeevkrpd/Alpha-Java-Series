package Functions;

public class Questios {

    public static float calAvgOfThree(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    public static boolean isEven(int n) {

        if (n == 1 || n == 2) {
            return false;
        }

        if (n % 2 == 0) {
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(int n) {

        int prevNo = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }

        if (prevNo == rev) {
            return true;
        }
        return false;
    }

    public static void sumOfDigit(int n) {
        int sum = 0;

        while (n > 0) {

            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        // float ans = calAvgOfThree(17, 5, 10);
        // System.out.println("Average = " + ans);

        // System.out.println(isEven(6));
        // System.out.printzln(isPalindrome(121212));

        sumOfDigit(125);
    }
}
