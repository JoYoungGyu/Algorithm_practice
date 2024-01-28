import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static int[] dp = new int[1001];
    public static int getTiling(int x){
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=x;i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        return dp[x];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = getTiling(Integer.parseInt(br.readLine()));
        sb.append(n);
        System.out.println(sb);
    }
}
