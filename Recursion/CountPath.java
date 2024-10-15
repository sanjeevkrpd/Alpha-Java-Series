package Recursion;

public class CountPath {

    public static int uniquePaths(int m, int n){

        if (m==1 || n ==1) {
            return 1;
        }

        int rightPath = uniquePaths(m-1, n);
        int bottomPath = uniquePaths(m, n-1);
        return rightPath + bottomPath;

    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
