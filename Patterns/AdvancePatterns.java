package Patterns;

public class AdvancePatterns {

    public static void hollow_rectangle(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rotate_halfPyramid(int row) {
        for (int i = 1; i < row; i++) {
            int space = row - i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (row - space); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void half_pyramid_nos(int row) {
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {

        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }

            System.out.println();
        }
    }

    public static void butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (n - space); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (n - space); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void diamond_shape(int n) {

        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for stars

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for stars

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // for spaces

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for numbers

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void palindromic_pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // ascending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollow_rectangle(5, 5);
        rotate_halfPyramid(5);
        half_pyramid_nos(5);

        floyds_triangle(5);
        zero_one_triangle(5);

        butterfly_pattern(5);
        solid_rhombus(5);
        hollow_rhombus(5);
        diamond_shape(5);
        number_pyramid(5);
        palindromic_pattern(5);
    }
}