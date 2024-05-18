import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        System.out.print("Enter How many Integers do you want to add : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < no; i++) {

            System.out.print("Enter The No : ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                sumOfEven += n;
            } else {
                sumOfOdd += n;
            }
        }

        System.out.println("Sum Of Even No: " + sumOfEven);
        System.out.println("Sum Of Odd No :  " + sumOfOdd);

        sc.close();
    }

}
