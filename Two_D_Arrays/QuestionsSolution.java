package Two_D_Arrays;

public class QuestionsSolution {

    public static void countFrequency(int matrix[][], int key) {

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }

        System.out.println(" total frequency is : " + count);
    }

    public static void sumOfRow(int matrix[][], int row) {
        int sum = 0;

        int end = matrix[row].length - 1;

        for (int i = 0; i <= end; i++) {

            sum += matrix[row][i];
        }

        System.out.println("Total sum is : " + sum);
    }

    public static void transpose_matrix(int matrix[][]) {

        int n = matrix.length;
        int m = matrix[0].length;

        int tmatrix[][] = new int[m][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                tmatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < tmatrix.length; i++) {
            for (int j = 0; j < tmatrix[i].length; j++) {

                System.out.print(tmatrix[i][j] + " ");

            }
        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        // countFrequency(matrix, 7);
        // sumOfRow(matrix, 1);
        transpose_matrix(matrix);
    }
}
