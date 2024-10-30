package LeetCodeProblems;

public class Nqueen {






    public static void nQueen(char board[][]  , int row){

        if(row == board.length){
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            
          if (isSafe(board, row, j)) {
              board[row][j] = 'Q';
              nQueen(board, row + 1);
              board[row][j] = 'X';
          }
        }

    }


    public static boolean isSafe(char board[][] , int row , int col){

        // Check vertically upwards
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal upwards
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


        // Check right diagonal upwards
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        
        
        int N = 4;

        char board[][] = new char[N][N];

       

        for (int i = 0; i < board.length; i++) {
            
            for (int j = 0; j < board.length; j++) {
                
                board[i][j] = 'X';
            }
            
            System.out.println();
        }


        nQueen(board, 0);

    }

    public static void printBoard(char board[][]){

        System.out.println();
        System.out.println("---------------- Chess Board -----------------");

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
