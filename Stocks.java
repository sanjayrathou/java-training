package Arrays;

public class Stocks {

    public static int buyAndSell(int[] prices) {

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {

            int sellPrice = prices[i];

            if (buyPrice < sellPrice) {

                int profit = sellPrice - buyPrice;

                maxProfit = (profit > maxProfit) ? profit : maxProfit;

            } else {

                buyPrice = sellPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int ans = buyAndSell(prices);

        System.out.println(ans);

    }

}
