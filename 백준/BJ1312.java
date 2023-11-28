package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] soSoo = br.readLine().split(" ");
        int A = Integer.parseInt(soSoo[0]);
        int B = Integer.parseInt(soSoo[1]);
        int N = Integer.parseInt(soSoo[2]);

        int result = A%B;
        // N-1까지는 나머지를 구해야함
        for(int i = 0; i< N-1; i++){
            result = (result * 10)%B;
        }
        // 마지막 해당하는 숫자에서는 정확한 값을 알아야하기 때문에 나누기를 해줘야함
        result = result * 10;

        bw.write(String.valueOf(result/B));
        bw.flush();
        bw.close();
    }
}
