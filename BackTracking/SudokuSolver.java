package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        // int[][] board = {
        //         { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
        //         { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
        //         { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
        //         { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
        //         { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
        //         { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
        //         { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
        //         { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
        //         { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        // };

    }

    // static boolean sudokuSolver(int board[][], int row, int col) {

    //     if (row == 9 && col == 9) {
    //         return true;
    //     } else if (row == 9) {
    //         return false;
    //     }

    //     int nextRow = row, nextCol = col + 1;

    //     if (col + 1 == 9) {
    //         nextRow = row + 1;
    //         nextCol = 0;
    //     }
    //     if (board[row][col]!=0) {
    //         return sudokuSolver(board, nextRow, nextCol);
    //     }

    //     for (int digit = 0; digit < board.length; digit++) {
            
    //         // if (isSafe(board , row,col , digit)) {
    //         //     board[row][col]=digit;
    //         // }
    //     }
    // }
}
