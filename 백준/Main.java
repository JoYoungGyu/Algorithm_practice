import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static int[] arr;
    public static boolean[] check;
    public static StringBuilder sb = new StringBuilder();

    public static void dfs(int n, int m, int depth){
        if(depth == m){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0; i<n; i++){
            if(!check[i]){
                if(depth > 0){
                    if(arr[depth-1] <= i){
                        check[i] = true;
                        arr[depth] = i+1;
                        dfs(n,m,depth+1);
                        check[i] = false;
                    }
                }else{
                    check[i] = true;
                    arr[depth] = i+1;
                    dfs(n,m,depth+1);
                    check[i] = false;
                }


            }
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n];

        dfs(n,m,0);
        System.out.println(sb);
    }
}