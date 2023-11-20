package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main{

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] corDi = new int[n][2];
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            corDi[i][0] = Integer.parseInt(arr[0]);
            corDi[i][1] = Integer.parseInt(arr[1]);
        }
        Arrays.sort(corDi , new Comparator<int[]>(){
            public int compare(int[] n1, int[] n2){
                if(n1[0] == n2[0]){
                    return n1[1] - n2[1];
                }else{
                    return n1[0] - n2[0];
                }
            }
        });

        for(int i=0; i< corDi.length; i++){
            bw.write(corDi[i][0] + " " + corDi[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
