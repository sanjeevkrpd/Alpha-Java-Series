package Bit_Manipulation;

public class Basic_Bit {

    public static boolean isEven(int no) {

        int bitMask = 1;

        if ((no & bitMask) == 0) {
            return true;
        }

        return false;
    }

    // operations

    // Get ith bit

    public static int getIthBit(int n, int i) {

        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;

    }

    // set Ith Bit

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        return (n | bitMask);
    }

    // clear Ith Bit

    public static int clearIthBit(int n, int i) {

        int bitMask = ~(1 << i);

        return (n & bitMask);

    }

    // update ith bit

    public static int updateIthBit(int n, int i) {

        if (getIthBit(n, i) == 0) {
            return setIthBit(n, i);
        } else {
            return clearIthBit(n, i);
        }
    }

    public static int clearLastIbits(int no, int i) {

        int bitMask = (~0) << i;

        return (no & bitMask);
    }

    public static boolean isPowerOfTwo(int n) {

        return (n & (n - 1)) == 0;

    }

    public static int countSetBits(int n) {

        int count = 0;

        while (n > 0) {

            if ((n & 1) != 0) {
                count++;
            }

            n = n >> 1;
        }

        return count;

    }

    public static void main(String[] args) {

        // System.out.println(isEven(4));
        // System.out.println(isEven(5));
        // System.out.println(isEven(14));

        // System.out.println(updateIthBit(10, 2));
        // System.out.println(updateIthBit(10, 3));
        // System.out.println(updateIthBit(7, 0));

        // System.out.println(isPowerOfTwo(14));

        System.out.println(countSetBits(15));
        System.out.println(countSetBits(25));
    }
}