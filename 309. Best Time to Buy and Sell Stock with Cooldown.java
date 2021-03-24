// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

// After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

// Example 1:

// Input: prices = [1,2,3,0,2]
// Output: 3
// Explanation: transactions = [buy, sell, cooldown, buy, sell]

class Solution {
    public int maxProfit(int[] p) {
        
        int osbp = -p[0];
        int ossp = 0;
        int oscp = 0;
        
        for(int i = 1; i<p.length;i++){
            int nsbp = 0;
            int nssp = 0;
            int nscp = 0;
            if(oscp - p[i] > osbp){
                nsbp = oscp - p[i] ;
            }else{
                nsbp = osbp;
            }
            
            if(osbp + p[i] > ossp){
                nssp = osbp + p[i];
            }else{
                nssp = ossp;
            }
            
            if(ossp>oscp){
                nscp = ossp;
            }else{
                nscp = oscp;
            }
             osbp = nsbp;
            ossp = nssp;
             oscp = nscp;
            
        }
        
        return ossp;
    }
}
