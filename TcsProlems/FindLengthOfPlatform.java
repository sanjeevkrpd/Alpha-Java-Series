package TcsProlems;

import java.util.Scanner;

public class FindLengthOfPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the train Speed in (kmph) : ");

        int trainSpeed = sc.nextInt();
        System.out.print("Enter the Length of the train in (m) : ");
        int trainLength = sc.nextInt();
        System.out.print("Enter the time to cross the platform by trian in (s) : ");
        int time = sc.nextInt();

        double tSpeedMPS =( trainSpeed * 1000.0)/3600.0;

        double lengthofPlatform = (tSpeedMPS * time) - trainLength;

        System.out.println();

        System.out.println("the length of the platform is (m) : " + lengthofPlatform);

        System.out.println();

        sc.close();
    }
}
