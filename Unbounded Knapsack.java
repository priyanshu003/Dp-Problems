/*
1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without 
    overflowing it's capacity.
Note -> Each item can be taken any number of times. You are allowed to put the same item again 
                  and again.*/
	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
	        
	     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        for(int i = 0;i<n;i++){
            val[i] = sc.nextInt();
        }
      for(int i = 0;i<n;i++){
         wt[i] = sc.nextInt();
        }
        int cap = sc.nextInt();

        int dp[] =  new int[cap+1];
        dp[0] = 0;
        for(int j = 0;j<n;j++ ){
             int w = wt[j];
            int vl = val[j];
        for(int i = w;i<dp.length;i++){
           
            //if(i>=w){
                dp[i] = Math.max(dp[i],dp[i-w]+vl);
           // }
        }
     }
        System.out.println(dp[cap]);
        
	    }
	}
