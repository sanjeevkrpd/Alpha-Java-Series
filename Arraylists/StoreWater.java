package Arraylists;

import java.util.*;

public class StoreWater {
    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println(maximumWater(height));
        System.out.println(maxWater(height));
    }

    static Integer maximumWater(ArrayList<Integer> height) {

        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {

            for (int j = i + 1; j < height.size(); j++) {

                int ht = Math.min(height.get(i), height.get(j));

                int width = j - i;

                int currWater = ht * width;

                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    static Integer maxWater(ArrayList<Integer> height) {
        int maxwater = 0;

        int si = 0;
        int ei = height.size() - 1;

        while (si <= ei) {

            int ht = Math.min(height.get(si), height.get(ei));
            int width = ei - si;

            int currWater = ht * width;

            maxwater = Math.max(maxwater, currWater);

            if (height.get(si) < height.get(ei)) {
                si++;
            } else {
                ei--;
            }
        }

        return maxwater;
    }

}
