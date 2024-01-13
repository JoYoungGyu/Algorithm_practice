/*
* 백준 1620 나는야 포켓몬 마스터 이다솜
* 자료구조 : 해시맵사용
* */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            String poketValue = br.readLine();
            map.put(String.valueOf(i+1), poketValue);
            map.put(poketValue, String.valueOf(i+1));
        }
        for(int j=0; j<m; j++){
            String poketValue = br.readLine();
            System.out.println(map.get(poketValue));
        }
    }
}
