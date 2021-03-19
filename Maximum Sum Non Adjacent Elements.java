// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers, representing n elements.
// 3. You are required to find the maximum sum of a subsequence with no adjacent elements.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        int inc = a[0]; //include current element
        int exc = 0;    //exclude current element
        
        for(int i = 1;i<n;i++){
            int ninc = exc+a[i];
            int nexc = Math.max(inc,exc);
            
            inc = ninc;
            exc = nexc;
        }
        System.out.println(Math.max(inc,exc));

    }
}
