package Strings;

public class ShortestPath {

    public static void getShortestPath(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {

            // south

            if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }

        int X = x * x;
        int Y = y * y;

        System.out.println(Math.sqrt(X + Y));
    }

    public static void main(String[] args) {

        String str = "WNEENESENNN";

        getShortestPath(str);
    }
}
