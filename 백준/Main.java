package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main{
       public static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> card = new HashMap<>();

        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            card.put(st.nextToken(), 0);
        }

        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<n2; j++){
            if(card.get(st.nextToken()) != null){
                sb.append("1"+" ");
            }else{
                sb.append("0"+" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

