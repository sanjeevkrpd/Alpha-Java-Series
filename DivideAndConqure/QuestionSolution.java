package DivideAndConqure;

public class QuestionSolution {

    public static int majorityElement(int arr[]) {

        int maj = arr[0];

        int count = 1;
        for (int i = 1; i < arr.length; i++) {


            if (arr[i] == maj) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                maj = arr[i];
                count = 1;
            }
        }

        return maj;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 3, 4 };
        System.out.println(majorityElement(arr));

    }
}
