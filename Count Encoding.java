// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. You are required to calculate and print the count of encodings for the string str.

//      For 123 -> there are 3 encodings. abc, aw, lc
//      For 993 -> there is 1 encoding. iic 
//      For 013 -> This is an invalid input. A string starting with 0 will not be passed.
//      For 103 -> there is 1 encoding. jc
//      For 303 -> there are 0 encodings. But such a string maybe passed. In this case 
//      print 0.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] dp = new int[str.length()];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            if(str.charAt(i - 1) == '0'){
                if(str.charAt(i) != '0'){
                    dp[i] = dp[i - 1];
                }else{
                    dp[i] = 0;
                } 
            } else {
                if(str.charAt(i) != '0'){
                    dp[i] = dp[i - 1];
                }

                if(Integer.parseInt(str.substring(i - 1, i + 1)) <= 26){
                    dp[i] += i == 1? 1: dp[i - 2];
                }
            }
        }

        System.out.println(dp[str.length() - 1]);
    }

    public static void printEncodings(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        } else if (ques.length() == 1) {
            if (ques.charAt(0) == '0') {
                return;
            } else {
                String ch0 = ques.substring(0, 1);
                String roq0 = ques.substring(1);
                String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";
                printEncodings(roq0, ans + code0);
            }
        } else {
            if (ques.charAt(0) == '0') {
                return;
            } else {
                String ch0 = ques.substring(0, 1);
                String roq0 = ques.substring(1);
                String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";
                printEncodings(roq0, ans + code0);

                String ch01 = ques.substring(0, 2);
                String roq01 = ques.substring(2);
                String code01 = (char)('a' + (Integer.parseInt(ch01) - 1)) + "";

                if (Integer.parseInt(ch01) <= 26) {
                    printEncodings(roq01, ans + code01);
                }
            }
        }
    }
}


                        
