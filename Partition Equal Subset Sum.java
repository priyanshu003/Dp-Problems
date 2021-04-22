// Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

 

// Example 1:

// Input: nums = [1,5,11,5]
// Output: true
// Explanation: The array can be partitioned as [1, 5, 5] and [11].
// Example 2:

// Input: nums = [1,2,3,5]
// Output: false
// Explanation: The array cannot be partitioned into equal sum subsets.

class Solution {
    public boolean canPartition(int[] n) {
        int sum  = 0;
        for(int i = 0;i<n.length;i++){
            sum += n[i];
        }
        if(sum%2 != 0){
            return false;
        }
        sum = sum/2;
           boolean dp[][] = new boolean[n.length+1][sum+1];
        for(int x = 0;x<dp.length;x++){
            dp[x][0] = true;
        }
          for(int t = 1;t<dp[0].length;t++){
            dp[0][t] = false;
        }
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                if(j >= n[i-1]){
                    dp[i][j] = dp[i-1][j-n[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n.length][sum];
        
    }
}
