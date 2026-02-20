public class buy_sell_stocks {
    //you are given prices where prices[i] is the price of a given stock on the ith day.
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    //buy price - minimum price so far
    //sell price - current price - minimum price so far
    public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ //profit
                int profit=prices[i]-buyPrice; //today's profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
