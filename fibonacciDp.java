import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int dp[] = new int[n+1];
   int fn = memorizeFn(n,dp);
   System.out.println(fn);
   
 }
       public static int memorizeFn(int n,int[] dp){
           if(n==0 || n==1){
               return n;
           }
           if(dp[n]!=0){
               return dp[n];
           }   
               int f1 = memorizeFn(n-1,dp);
               int f2 = memorizeFn(n-2,dp);
               int f = f1+f2;
               dp[n] = f;
               return f;
           }
       }
