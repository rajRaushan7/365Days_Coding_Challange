public class buy_and_sell_stocks {
    
    public static int buyAndSellStocks(int price[]) {

        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n ; i++) {
             if(buyPrice < price[i]){ // Profit
                int profit = price[i] - buyPrice;   // Today's Profit
                maxProfit = Math.max(profit, maxProfit);
             } else {
                buyPrice = price[i];
             }
        }
        return maxProfit;
    }
    public static void main (String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int ans = buyAndSellStocks(prices);
        System.out.println(ans);
    }
}