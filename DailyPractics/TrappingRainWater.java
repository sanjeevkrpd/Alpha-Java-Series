package DailyPractics;

public class TrappingRainWater {


    public static int getTrapWater(int[] height){

        int n = height.length;

        int leftArr[] = new int[n];

        leftArr[0] = height[0];

        for (int i = 1; i < leftArr.length; i++) {
            
            leftArr[i] = Math.max(leftArr[i-1], height[i]);
        }

        int rightArr[] = new int[n];

        rightArr[n-1] = height[n-1];

        for (int i = n-2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i+1], height[i]);
        }

        int trappedRainwater = 0;


        for (int i = 0; i < height.length; i++) {
            
            int waterleve  = Math.min(leftArr[i], rightArr[i]);

            trappedRainwater +=waterleve - height[i];
        }

        return trappedRainwater;


    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(getTrapWater(height));
    }
}
