class Solution {
    public int maxProfit(int[] prices) {
       int minn=prices[0];
       int profit=0;
       int n=prices.length;
       for(int i=1;i<n;i++){
        int cost=prices[i]-minn;
        profit= Math.max(profit,cost);
        minn= Math.min(minn,prices[i]);
       } 
       return profit;
    }
}