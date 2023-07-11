import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 백준
* 11021번
* A+B -7
* */
public class AB_8 {
    public static void main(String[] args) throws Exception{     //readLine을 사용할 때는 예외처리를 해줘야함 main옆에 해줘야 함
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            int t = Integer.parseInt(br.readLine());
            int n1;
            int n2;

            for(int i=1; i<t+1; i++){
                st = new StringTokenizer(br.readLine(), " "); //readLine()은 한행을 전부 읽기 때문에 공백단위로 입력해준 문자열을공백단위로 분리해야함
                n1 = Integer.parseInt(st.nextToken());
                n2 = Integer.parseInt(st.nextToken());
                bw.write("Case #"+i+": "+n1+" + "+n2+" = "+(n1+n2)+"\n");
            }
            bw.close();
    }
}



