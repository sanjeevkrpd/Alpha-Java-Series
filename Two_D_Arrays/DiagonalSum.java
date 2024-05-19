package Two_D_Arrays;

public class DiagonalSum {

    public static void diagonalSum_01(int matrix[][]) {

        int pd_Sum = 0;
        int sd_Sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j) {
                    pd_Sum += matrix[i][j];
                }
                if (i + j == 3) {
                    sd_Sum += matrix[i][j];
                }
            }
        }
        System.out.println("primary sum   : " + pd_Sum);
        System.out.println("secondary sum : " + sd_Sum);
    }

    public static void diagonalSum_02(int matrix[][]){
        int pd_Sum = 0;
        int sd_Sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            
            // primary sum
              
            pd_Sum += matrix[i][i];

            // secondary sum

            sd_Sum += matrix[i][matrix.length-i-1];


        }
        
        System.out.println("primary sum   : " + pd_Sum);
        System.out.println("secondary sum : " + sd_Sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };

        /*
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 11 12
         * 13 14 15 16
         */
        // diagonalSum_01(matrix);
        diagonalSum_02(matrix);
    }
}
