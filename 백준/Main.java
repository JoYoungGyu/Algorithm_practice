/*
* 1003 피보나치 함수
* for문 이용
* */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static int[] getNum(int x){
        int[] answer = new int[2];
        int zero = 1;
        int one = 0;
        int two = 1;
        for(int i=0; i<x; i++){
            zero = one;
            one = two;
            two = zero+one;
        }
        answer[0] = zero;
        answer[1] = one;
        return answer;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int[] value = new int[2];
            value = getNum(Integer.parseInt(br.readLine()));
            sb.append(value[0] + " " + value[1]).append("\n");
        }
        System.out.println(sb);
    }
}

/*
* 재귀함수 이용
* */

/*
재귀호출을 할 때 이미 한 번 탐색(연산)했던 값이 있다면 또다시 연산하는 것이 아니라
이미 계산된 값을 재사용하여 반복적인 연산과정을 줄이는 방법이 DP풀이의 기초다.
*/
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
        import java.io.BufferedWriter;
        import java.io.OutputStreamWriter;

public class Main{
    static Integer[][] dp = new Integer[41][2];
    public static Integer[] fibonacci(int N){
        //N에 대한 0, 1의 호출 횟수가 없을 때(탐색하지 않은 값일 때)
        if(dp[N][0] == null || dp[N][1] == null){
            // 각 N에 대한 0의 호출횟수와 1 호출횟수를 재귀한다.
            dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
            dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
        }
        //N에 대한 0과 1, 즉 [N][0], [N][1]을 담고있는 [N]을 반환
        return dp[N];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp[0][0] = 1; // N=0 일 때 0의 호출갯수
        dp[0][1] = 0; // N=0 일 때 1의 호출갯수
        dp[1][0] = 0; // N=1 일 때 0의 호출갯수
        dp[1][1] = 1; // N=1 일 때 1의 호출갯수
        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] +" "+ dp[N][1]).append("\n");
        }
        System.out.println(sb);
    }
}