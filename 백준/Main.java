
package me.joyeonggyu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static StringBuilder sb = new StringBuilder();
    public static long[] arr = new long[101];

    public static void getSeries(int n){
        arr[0]= 1L;
        arr[1]= 1L;
        arr[2]= 1L;

        if(n<3){
            sb.append(arr[n-1]).append('\n');
            // System.out.println(arr[n-1]);
        }else{
            for(int i=3; i<=n; i++){
                arr[i] = arr[i-2] + arr[i-3];
            }
            sb.append(arr[n-1]).append('\n');
            //   System.out.println(arr[n-1]);
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            getSeries(m);
        };
        System.out.print(sb);
        // bw.write(sb.toString()); // System.out.print(sb); 대신 bw.write(sb.toString()); 사용
        // bw.flush(); // 버퍼 비우기
        // bw.close(); // BufferedWriter 닫기
    }
}