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
// // Java Program to find n'th fibonacci Number
// import java.util.*;
 
// class GFG {
 
// static int fib(int n) {
// double phi = (1 + Math.sqrt(5)) / 2;
// return (int) Math.round(Math.pow(phi, n) 
//                         / Math.sqrt(5));
// }
 
// // Driver Code
// public static void main(String[] args) {
//         int n = 9;
//     System.out.println(fib(n));
//     }
// }

// Number with O(Log n) arithmetic operations
// import java.util.*;
 
// class GFG {
     
//     static int MAX = 1000;
//     static int f[];
     
//     // Returns n'th fibonacci number using 
//     // table f[]
//     public static int fib(int n)
//     {
//         // Base cases
//         if (n == 0)
//             return 0;
             
//         if (n == 1 || n == 2)
//             return (f[n] = 1);
      
//         // If fib(n) is already computed
//         if (f[n] != 0)
//             return f[n];
      
//         int k = (n & 1) == 1? (n + 1) / 2
//                             : n / 2;
      
//         // Applying above formula [Note value
//         // n&1 is 1 if n is odd, else 0.
//         f[n] = (n & 1) == 1? (fib(k) * fib(k) + 
//                         fib(k - 1) * fib(k - 1))
//                        : (2 * fib(k - 1) + fib(k)) 
//                        * fib(k);
      
//         return f[n];
//     }
     
//     /* Driver program to test above function */
//     public static void main(String[] args) 
//     {
//         int n = 9;
//         f= new int[MAX];
//         System.out.println(fib(n));
//     }
// }
