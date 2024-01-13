/*
    백준 2217 로프
* */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        int max = 0;
        int cnt = 0;
        int arrLen = arr.size();
        for(int i = 0; i<arrLen; i++){
            int tmpMax = (arr.get(i) * (arrLen-cnt));
            cnt++;
            if(tmpMax > max){
                max = tmpMax;
            }
        }
        System.out.println(max);
    }
}
