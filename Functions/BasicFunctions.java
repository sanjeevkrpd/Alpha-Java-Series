package Functions;

public class BasicFunctions {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;

        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

        }

        return true;
    }

    public static void primeInRange(int n) {

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum += rem * (int) Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        System.out.println("Decimal of " + myNum + " = " + binNum);

    }

    public static void binToDec(int n) {
        int myNum = n;
        int pow = 0;
        int decNum = 0;

        while (n > 0) {

            int rem = n % 10;
            decNum += rem * (int) Math.pow(2, pow);
            pow++;
            n /= 10;
        }
        System.out.println("Binary of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(1111);
    }
}