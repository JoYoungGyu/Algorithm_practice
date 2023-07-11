import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/*
* 백준
* 2438번
* 별 찍기-1
* */
public class Star1 {
    public static void main(String[] args) throws Exception{     //readLine을 사용할 때는 예외처리를 해줘야함 main옆에 해줘야 함
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int t = Integer.parseInt(br.readLine());

            for(int i=1; i<t+1; i++){
                for(int j=0;j<i; j++){
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.close();
    }
}



