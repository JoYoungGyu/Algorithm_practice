/*
    백준 1764 듣보잡
    자료구조 : 해시맵사용
* */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n ; i++){
            String val = br.readLine();
            map.put(val, map.getOrDefault(val,0)+1);
        }
        for(int i=0; i< m; i++){
            String chkValue = br.readLine();
            if(map.containsKey(chkValue)){
                System.out.print(chkValue);
            }
        }
    }
}
