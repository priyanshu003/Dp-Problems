// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// Find the maximum profit you can achieve. You may complete at most two transactions.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

// Example 1:

// Input: prices = [3,3,5,0,0,3,1,4]
// Output: 6
// Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
// Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.

class Solution {
    public int maxProfit(int[] p) {
        int leastsf =p[0];
        int mprofit = 0;
        int dpl[] = new int[p.length];
        for(int i = 1;i<p.length;i++){
            if(p[i]<leastsf){
                leastsf = p[i];
            }
             mprofit = p[i] - leastsf;
            if(dpl[i-1]<mprofit){
                dpl[i] = mprofit;
            }else{
                dpl[i] = dpl[i-1];
            }
        }
        
        
        int maxsf = p[p.length-1];
        int maxbsp = 0;
        int dpr[] = new int[p.length];
        for(int i = p.length-2;i>=0;i--){
            if(p[i]>maxsf){
                maxsf = p[i];
            }
            maxbsp = maxsf - p[i];
            if(maxbsp > dpr[i+1]){
                dpr[i] = maxbsp;
            }else{
                dpr[i] = dpr[i+1];
            }
        }
        int op =0;
        for(int i = 0;i<p.length;i++){
            if(dpl[i]+dpr[i]>op){
                op =dpl[i]+dpr[i];
            }
        }
        return op;
    }
}
