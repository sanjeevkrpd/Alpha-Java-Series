package BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3; // Size of the board and the number of knights
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.'; // Initialize the board with empty spaces
            }
        }
        solveBoard(board, 0, 0, n);
    }

    public static void solveBoard(char[][] board, int row, int knightsPlaced, int totalKnights) {
        if (knightsPlaced == totalKnights) {
            printBoard(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'K';
                solveBoard(board, row + 1, knightsPlaced + 1, totalKnights);
                board[row][col] = '.';
            }
        }

        // Try without placing a knight at the current row
        solveBoard(board, row + 1, knightsPlaced, totalKnights);
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // All possible moves for a knight
        int[] rowOffsets = { -2, -2, -1, -1, 1, 1, 2, 2 };
        int[] colOffsets = { -1, 1, -2, 2, -2, 2, -1, 1 };

        for (int i = 0; i < 8; i++) {
            int newRow = row + rowOffsets[i];
            int newCol = col + colOffsets[i];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board.length) {
                if (board[newRow][newCol] == 'K') {
                    return false;
                }
            }
        }

        return true;
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
