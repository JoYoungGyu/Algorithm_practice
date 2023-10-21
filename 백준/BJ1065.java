package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(HanNumber(n)));
        bw.flush();

        br.close();
        bw.close();
    }

    public static int HanNumber(int n){
        int cnt = 0 ;
        if(n < 100){
            cnt = n;
        }else{
            cnt = 99;
            for(int i=100; i<n+1; i++){
                int one = i/100;
                int two = (i/10)%10;
                int three = i%10;

                if((one-two)==(two-three)){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
