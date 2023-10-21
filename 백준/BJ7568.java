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
        int[] key = new int[n];
        int[] MoM = new int[n];
        int[] count = new int[n];
        for(int i =0; i< n; i++){
            String str = br.readLine();
            String[] split = str.split(" ");
            MoM[i] = Integer.parseInt(split[0]);
            key[i] = Integer.parseInt(split[1]);

        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(key[i] > key[j] && MoM[i] > MoM[j]){
                    count[j]++;
                }else if(key[i] < key[j] && MoM[i] < MoM[j]){
                    count[i]++;
                }
            }
        }

        for(int i : count){
            bw.write(String.valueOf(i+1)+" ");
            bw.flush();
        }


        br.close();
        bw.close();
    }
}
