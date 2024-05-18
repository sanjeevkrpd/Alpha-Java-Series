package Arrays;

public class BuyAndSell {

    public static void BuyAndSellStock(int prices[]) {

        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (buyStock < prices[i]) {
                int profit = prices[i] - buyStock;

                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = prices[i];
            }
        }
        System.out.println(maxProfit);

    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };

        BuyAndSellStock(prices);
    }
}
