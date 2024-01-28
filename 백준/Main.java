/*
 * 백준 1463 DP
 * 이모이제이션 사용
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static Integer[] dp;
    public static int getRecur(int n){
        if(dp[n] == null){
            if(n%6==0){
                dp[n] = Math.min(getRecur(n/3),Math.min(getRecur(n/2),getRecur(n-1))) +1;
            }else if(n%3==0){
                dp[n] = Math.min(getRecur(n/3),getRecur(n-1))+1;
            }else if(n%2==0){
                dp[n] = Math.min(getRecur(n/2),getRecur(n-1))+1;
            }else{
                dp[n] = getRecur(n-1)+1;
            }
        }
        return dp[n];
    };

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        dp[0] = dp[1] = 0;

        bw.write(String.valueOf(getRecur(n)));
        bw.flush();
        bw.close();
    }
}