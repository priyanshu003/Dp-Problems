// 1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
// 2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
// 3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[][] = new int[n][k];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<k;j++){
                h[i][j] = sc.nextInt();
            }
        }
        
        int dp[][] = new int[n][k];
        
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int i = 0 ;i<h[0].length;i++){
            int val = h[0][i];
            dp[0][i] = val;
            
            
            
            if(val<=least){
                sleast = least;
                least = val;
            }else if(val<=sleast){
                sleast = val;
            }
            
            
        }
        
        for(int i = 1;i<dp.length;i++){
              
        int nleast = Integer.MAX_VALUE;
        int nsleast = Integer.MAX_VALUE;
            for(int j = 0;j<dp[0].length;j++){
                if(least == dp[i-1][j]){
                    dp[i][j] = h[i][j] + sleast; 
                }else{
                    dp[i][j] = least + h[i][j];
                }
                  if(dp[i][j]<=nleast){
                      nsleast = nleast;
                      nleast = dp[i][j];
            }else if(dp[i][j]<=nsleast){
                nsleast = dp[i][j];
            }
         }
         least = nleast;
         sleast = nsleast;
            
        }
        
        
        System.out.println(least);
        
        
        
        
        
    }
}
