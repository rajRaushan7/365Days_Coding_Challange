public class MaxStockPrice {
    public static void main(String[] args){

        int prices[] = {7, 1, 5, 3, 6, 4};
        int bp = prices[0];
        int profit = 0;

        for (int sp = 1; sp < prices.length; sp++){
            if ((prices[sp] - bp) > profit) {
                profit = prices[sp] - bp;
            }
            if (prices[sp] - bp < 0) {
                bp = prices[sp];
            }
        }

        System.out.println(profit);

    }
}