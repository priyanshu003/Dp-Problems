// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed a single transaction.


import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int msf = arr[0];
      int op = 0;
      for(int i = 1; i < arr.length; i++){
         if(arr[i] < msf){
            msf = arr[i];
         }

         int cp = arr[i] - msf;
         if(cp > op){
            op = cp;
         }
      }

      System.out.println(op);
   }

}


                        
                        
