// You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.

// Find the maximum profit you can achieve. You may complete at most k transactions.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

// Example 1:

// Input: k = 2, prices = [2,4,1]
// Output: 2
// Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
class Solution {
    public int maxProfit(int k, int[] arr) {
         if(arr.length < 2)
        {
            return 0;
        }
        
        int dp[][] = new int[k+1][arr.length];
        
        for(int t = 1;t<=k;t++){
            int max = Integer.MIN_VALUE;
            for(int d = 1;d<arr.length;d++){
                
               if(dp[t-1][d-1] - arr[d-1]>max){
                    max = dp[t-1][d-1] - arr[d-1];
               }
                if(max+arr[d] > dp[t][d-1]){
                    dp[t][d] = max + arr[d];
                }else{
                    dp[t][d] = dp[t][d-1];
                }
            }
        }
        
        return dp[k][arr.length-1];
    }
}
