package me.joyeonggyu;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int  N = s.length();
        List<String> arr = new ArrayList<>();
        for(int a=1; a< N ; a++){
            for(int b = a+1; b<N; b++){
                arr.add(getWord(s, a, b));
            }
        }
        Collections.sort(arr);
        bw.write(arr.get(0));
        bw.flush();
        bw.close();
    }

    public String getWord(String s, int a, int b){
        StringBuilder s1 = new StringBuilder(s.substring(0,a));
        StringBuilder s2 = new StringBuilder(s.substring(a,b));
        StringBuilder s3 = new StringBuilder(s.substring(b));
        StringBuilder sb = new StringBuilder();

        sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse());

        return sb.toString();
    }
}
