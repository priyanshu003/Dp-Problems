// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed infinite transactions.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy)

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

      int bon = 0;
      int son = 0;
      int op = 0;
      for(int i = 1; i < arr.length; i++){
         if(arr[i] < arr[i - 1]){   //dip
            op += arr[son] - arr[bon];  //old profit
            bon = son = i;
         } else {
            son++;  //up
         }
      }

      op += arr[son] - arr[bon]; // last up
      System.out.println(op);
   }

}


                        
