package Arraylists;

import java.util.*;;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(10);

        // System.out.println(pairSum(list, 5));

        // System.out.println(pairSum2(list, 3));
        System.out.println(pairSumOptimised(list, 16));
    }

    static boolean pairSum(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j <= list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean pairSum2(ArrayList<Integer> list, int target) {

        int si = 0;
        int ei = list.size() - 1;
        while (si < ei) {

            if (list.get(si) + list.get(ei) == target) {
                return true;
            } else if (list.get(si) + list.get(ei) < target) {
                si++;
            } else {
                ei--;
            }
        }

        return false;
    }

    static boolean pairSumOptimised(ArrayList<Integer> list, int target) {

        int bp = -1;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int si = bp + 1;
        int ei = bp;

        while (si != ei) {

            if (list.get(si) + list.get(ei) == target) {
                return true;
            } else if (list.get(si) + list.get(ei) < target) {

                si = (si + 1) % list.size();
            } else {
                ei = (list.size() - ei - 1) % list.size();
            }
        }

        return false;
    }
}
