// You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee representing a transaction fee.

// Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int obs = -prices[0];
        int oss = 0;
        
        for(int i = 1;i<prices.length;i++){
            int nbs = 0;
            int nss = 0;
            if(oss - prices[i] > obs){
                nbs = oss - prices[i];
            }else{
                nbs = obs;
            }
            
            if(prices[i] - fee + obs >oss){
                nss = prices[i] - fee + obs ;
            }else{
                nss = oss;
            }
            obs = nbs;   //new brought state
            oss = nss;  //new sold state
        }
        return oss  ;
    }
}
