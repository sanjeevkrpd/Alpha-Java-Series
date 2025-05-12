package DailyPractics;

public class ContainWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int l = 0, r = height.length - 1, water = 0;

        while (l < r) {
            int current_Water = Math.min(height[l], height[r]) * (r - l);
            water = Math.max(water, current_Water);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println("Maximum water that can be contained: " + water);
    }
}
