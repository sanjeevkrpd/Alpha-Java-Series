package Two_D_Arrays;

import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print("Enter the value at : ");
                matrix[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
        }

        sc.close();
    }

}
