package SelfQuestions;

public class ChessBoard {

    public static void createBoard(char arr[][], int n) {
        if (n == arr.length) {
            printBoard(arr);
            return;
        }

        for (int col = 0; col < arr.length; col++) { 
            arr[n][col] = 'Q';
            createBoard(arr, n + 1);
            arr[n][col] = '.'; 
        }
    }

    public static void printBoard(char arr[][]) {
        System.out.println("---------- Print Board ---------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }

        createBoard(arr, 0);
    }
}
