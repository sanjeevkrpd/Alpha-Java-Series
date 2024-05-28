package BackTracking;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 4));

        // path("", 3, 3);

        // pathRestriction("", board, 0, 0);
        boolean board[][] = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        allPaths("", board, 0, 0);
    }

    public static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    public static void path(String p, int row, int col) {

        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p + "V", row - 1, col);
        }
        if (row > 1 && col > 1) {
            path(p + "D", row - 1, col - 1);
        }
        if (col > 1) {
            path(p + "H", row, col - 1);
        }

    }

    public static void pathRestriction(String p, boolean board[][], int row, int col) {

        if (row == board.length - 1 && col == board[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!board[row][col]) {
            return;
        }

        if (row < board.length - 1) {
            pathRestriction(p + "D", board, row + 1, col);
        }
        if (col < board[0].length - 1) {
            pathRestriction(p + "R", board, row, col + 1);
        }
    }

    public static void allPaths(String s, boolean board[][], int r, int c) {

        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(s);
            return;
        }

        if (!board[r][c]) {
            return;
        }

        board[r][c] = false;

        if (r > 0) {
            allPaths(s + "U", board, r - 1, c);
        }
        if (c < board[0].length - 1) {
            allPaths(s + "R", board, r, c + 1);
        }
        if (r < board.length - 1) {
            allPaths(s + "D", board, r + 1, c);
        }
        if (c > 0) {
            allPaths(s + "L", board, r, c - 1);
        }

        board[r][c] = true;

    }
}
