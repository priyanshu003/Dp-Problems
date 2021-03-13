/*Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

 

Example 1:


Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12  */

class Solution {
    public int minPathSum(int[][] g) {
        int r = g.length;
        int c = g[0].length;
        if (g == null || g.length == 0 || g[0].length == 0) {
            return 0;
        }
        int dp[][] = new int[r][c];
        
        for(int i = dp.length-1;i>=0;i--){
            for(int j = dp[0].length-1;j>=0;j--){
                if(i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = g[i][j];
                }else if(i == dp.length-1){
                    dp[i][j] = g[i][j] + dp[i][j+1];
                }else if(j == dp[0].length-1){
                    dp[i][j] = g[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + g[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
