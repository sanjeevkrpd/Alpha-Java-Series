package Arraylists;

import java.util.*;

public class QuestionSolution {

    public static boolean isMonotonic(ArrayList<Integer> list) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > list.get(i - 1)) {
                increasing = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                decreasing = false;
            }

        }

        return increasing || decreasing;
    }

    public static ArrayList<Integer> lonelyInteger(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(list);

        for (int i = 0; i < set.size(); i++) {
            int current = list.get(i);
            if (!set.contains(current + 1) && !set.contains(current - 1)) {
                ans.add(current);
            }
        }

        return ans;
    }

    public static int mostOccuring(ArrayList<Integer> list, int key) {

        int result[] = new int[1000];
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) == key) {

                result[list.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // list.add(6);
        // list.add(5);
        // list.add(4);
        // list.add(4);
        // System.out.println(isMonotonic(list));

        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(3);
        // ArrayList<Integer> result = lonelyInteger(list);
        // System.out.println(lonelyInteger(result));
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int increment = 1;
        int n = 10;

        divideConquer(start, increment, result, n);

        System.out.println(result);
    }

    public static void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2 * increment, res, n);
        divideConquer(start + increment, 2 * increment, res, n);
    }
}
