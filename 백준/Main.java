package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] answer = br.readLine().split("");
        for(int i=0; i<n-1; i++){
            String[] comparsion = br.readLine().split("");
            for(int j=0; j<answer.length; j++){
                if(comparsion[j].equals(answer[j])){
                    continue;
                }else{
                    answer[j] = "?";
                }
            }
        }
    for(String i : answer){
        bw.write(String.valueOf(i));
    }
    bw.flush();
    bw.close();
}
}