package BackTracking;

public class RatInMaze {

    public static void printMaze(int maze[][]) {

        System.out.println("------ Solution ------");

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveMaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];

        if (solveMazeUntil(maze, 0, 0, sol) == false) {
            System.out.println("no Solution exist");
            return false;
        }
        printMaze(maze);
        return true;
    }

    public static boolean solveMazeUntil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;

        }

        // check x and y is valid or not

        if (isSafe(maze, x, y) == true) {
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;
            if (solveMazeUntil(maze, x + 1, y, sol)) {
                return true;
            }
            if (solveMazeUntil(maze, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;

            return false;
        }

        return false;
    }

    public static boolean isSafe(int maze[][], int x, int y) {

        // if x and y outside the maze return false;

        return (x >= 0 && x < maze.length &&
                y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static void main(String[] args) {

        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        // solveMaze(maze);
        pathMaze("", maze, 0, 0);
    }

    public static void pathMaze(String p, int maze[][], int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] != 1) {
            return;
        }

        if (r < maze.length - 1) {
            pathMaze(p + "D", maze, r + 1, c);
        }

        if (c < maze.length - 1) {
            pathMaze(p + "R", maze, r, c + 1);
        }
    }
}
