import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
* 백준
* 11021번
* A+B -7
* */
public class AB_7 {
    public static void main(String[] args) throws Exception{     //readLine을 사용할 때는 예외처리를 해줘야함 main옆에 해줘야 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<t+1; i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #"+i+": " +(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) +"\n");
        }
        bw.close();
    }
}



