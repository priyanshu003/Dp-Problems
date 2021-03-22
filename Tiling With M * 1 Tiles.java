// 1. You are given a number n and a number m separated by line-break representing the length and breadth of a n * m floor.
// 2. You've an infinite supply of m * 1 tiles.
// // 3. You are required to calculate and print the number of ways floor can be tiled using tiles.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int dp[] = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i < m) {
                dp[i] = 1;
            } else if (i == m) {
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }

        
        System.out.println(dp[n]);
    }
}
