package Two_D_Arrays;

public class SearchInMatrix {

    public static void searchInMatrix_01(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][j] == key) {

                    System.out.println("Found at index at : " + i + " " + j);
                }
            }

        }
        System.out.println("Key is not presend ");
    }

    public static void searchInMatrix_02(int matrix[][], int key) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {

            int index = binarySearch(matrix[i], i, matrix[i].length - 1, key);
            if (index != -1) {
                found = true;
                System.out.println("Element Found at : " + i + " " + index);
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

    public static int binarySearch(int arr[], int start, int end, int key) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void searchInMatrix_03(int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1;
        boolean found = false;
        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Element Found at : " + row + " " + col);
                found = true;
                break;

            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };

        // searchInMatrix_01(matrix, 12);

        // searchInMatrix_02(matrix, 4);
        searchInMatrix_03(matrix, 10);
    }
}