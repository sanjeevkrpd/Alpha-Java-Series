package BackTracking;

public class RatMazeProblem {

    static int count = 0;

    public static void main(String[] args) {

        int maze[][] = {
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 }
        };

        char path[][] = new char[maze.length][maze[0].length];

        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path.length; j++) {
                path[i][j] = 'X';
            }
        }
        solveMaze("", maze, 0, 0, path);

        System.out.println("Total No of Solution is : " + count);
    }

    public static void solveMaze(String p, int maze[][], int r, int c, char path[][]) {

        if (r == maze.length - 1 && c == maze.length - 1) {
            path[r][c] = '-';
            count++;
            printPath(path);
            System.out.println("Solution In Direction : " + p);
            return;
        }

        if (maze[r][c] != 1) {
            return;
        }

        path[r][c] = '-';

        maze[r][c] = 2;

        // UP Turn

        if (r > 0) {
            solveMaze(p + "U", maze, r - 1, c, path);
        }

        // Right Turn

        if (c < maze[0].length - 1) {
            solveMaze(p + "R", maze, r, c + 1, path);
        }

        // Down Turn
        if (r < maze.length - 1) {
            solveMaze(p + "D", maze, r + 1, c, path);
        }

        // Left Turn

        if (c > 0) {
            solveMaze(p + "L", maze, r, c - 1, path);
        }

        if (r < maze.length - 1 && c < maze[0].length - 1) {
            solveMaze(p + "C", maze, r + 1, c + 1, path);
        }

        maze[r][c] = 1;

    }

    public static void printPath(char path[][]) {
        System.out.println(" ------ solution Exist -------- ");
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }
}
