import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static int[] arr = new int[301];  //점수
    static int[] stair = new int[301];  //계단에 부여되어있는 점수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }
        arr[1] = stair[1];
        arr[2] = stair[1] + stair[2];
        arr[3] = Math.max(stair[1], stair[2]) + stair[3];
        for(int i=4; i<= n; i++){
            arr[i] = Math.max((arr[i-3]+stair[i-1]), arr[i-2]) + stair[i];
        }
        System.out.println(arr[n]);
    }
}
