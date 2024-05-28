package BackTracking;

public class Nqueen {
    public static void main(String[] args) {

        int N = 4, M = 4;

        char board[][] = new char[N][M];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        placeNqueens(board, 0);
    }

    public static void placeNqueens(char[][] board, int r) {

        if (r == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, r, col)) {
                board[r][col] = 'Q';

                placeNqueens(board, r + 1);
                board[r][col] = '.';
            }

        }

    }

    public static boolean isSafe(char[][] board, int r, int c) {

        for (int i = 0; i < r; i++) {
            if (board[i][c] == 'Q') {
                return false;
            }
        }

        // diagonal left
        int leftMax = Math.min(r, c);
        for (int i = 1; i <= leftMax; i++) {
            if (board[r - i][c - i] == 'Q') {
                return false;
            }
        }

        // diagonal right

        int rightMax = Math.min(r, board.length - c - 1);

        for (int i = 0; i <= rightMax; i++) {
            if (board[r - i][c + i] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
