/*1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of permutations of the n coins using which the 
     amount "amt" can be paid.

Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
                  used for many installments in payment of "amt"
Note2 -> You are required to find the count of permutations and not combinations i.e.
                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
                  combination. You should treat them as 3 and not 1.*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        findAmt(a,n,amt);
        
    }
    public static void findAmt(int coins[],int n,int amt){
        int dp[] = new int[amt+1];
        dp[0] = 1;
        
        for(int i = 1 ;i<dp.length;i++){
            for(int j = 0;j<n;j++){
                if(i>=coins[j]){
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        System.out.println(dp[amt]);
    }
}
