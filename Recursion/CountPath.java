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
    
 public static int fib(int n){

    if(n==1 || n==0){
        return n;
    }
    int m1 = fib(n-1);
    int m2 = fib(n-2);

    return m1+m2;
 }
    public static void main(String[] args) {
        // System.out.println(uniquePaths(3,3));

        System.out.println(fib(8));
    }
}

