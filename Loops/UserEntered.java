import java.util.Scanner;

public class UserEntered {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
         * do {
         * System.out.print("Enter any no : ");
         * int n = sc.nextInt();
         * if (n % 10 == 0) {
         * break;
         * }
         * System.out.println(n);
         * } while (true);
         */

        do {
            System.out.print("Enter any no : ");
            int n = s.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("No was : " + n);
            s.close();
        } while (true);

    }
}
