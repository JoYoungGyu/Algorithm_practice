package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    private static int[][] dp = new int[31][31];

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            int M = Integer.parseInt(arr[1]);
            bw.write(String.valueOf(Combination(M, N)));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static int Combination(int n, int r) {
        // 이미 계산된 값
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        // 원소의 갯수가 조합의 갯수와 동일하거나 0일 경우
        else if (n == r || r == 0) {
            return dp[n][r] = 1;
        } else {
            return dp[n][r] = Combination(n - 1, r - 1) + Combination(n - 1, r);
        }
    }
}