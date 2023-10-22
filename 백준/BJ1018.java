package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        int max_N = N - 7;
        int max_M = M - 7;

        for(int i=0; i<max_N; i++){
            for(int j=0; j<max_M; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y){
        int count = 0;
        boolean TF = arr[x][y];

        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i][j] != TF){
                    count++;
                }
                TF = !TF;
            }
            TF = !TF;
        }
        count = Math.min(count, 64-count);

        min = Math.min(min,count);

    }
}
