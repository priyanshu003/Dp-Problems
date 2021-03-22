// 1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
// 2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two fences have same colors.

import java.io.*;
import java.util.*;

public class Main {

 
        public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
		 // used for swapping ith and jth elements of array
	  public static void swap(int[] arr, int i, int j) {
	    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }

	public static void main(String[] args)
	{
		FastReader sc = new FastReader();
		int t = 1;
		while(t-->0){
		int n = sc.nextInt();
		int k = sc.nextInt();
		long same = k*1;
		long diff = k*(k-1);
		long total = same + diff;
		for(int i =3;i<=n;i++){
		    same = diff*1;
		    diff = total*(k-1);
		    total = same+diff;
		}
		System.out.println(total);
	  }
	}
    
}
