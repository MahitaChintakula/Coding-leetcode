class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        if(prices == null || prices.length == 0){
            return 0;
        }
        for(int i=0;i<prices.length;i++){
            int p=prices[i]-min;
            profit=Math.max(profit,p);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}