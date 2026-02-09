// Last updated: 2/9/2026, 11:55:46 AM
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-buy);
            }
        }
        return profit;
    }
}