public class ReverseNumber {

    public static int reverseInteger(int no) {

        double rem = 0;
        boolean isNegative = false;
        if (no < 0) {
            no = -no;
            isNegative = true;
        }
        while (no != 0) {
            double lastdigit = no % 10;

            rem = (rem * 10) + lastdigit;
            no /= 10;
        }
        if (isNegative == true) {
            rem = -rem;
            return (int) rem;
        }
        return (int) rem;
    }

    public static void main(String[] args) {

        System.out.println(reverseInteger(1534236469));
        // int no = -123;
        // if (no < 0) {
        // System.out.println(true);
        // } else {
        // System.out.println(false);
        // }
    }
}