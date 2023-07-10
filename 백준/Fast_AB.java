import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;     //예외처리
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
* 백준
* 15552번
* 빠른 A+B
* */
public class Fast_AB {
    public static void main(String[] args) throws IOException{     //readLine을 사용할 때는 예외처리를 해줘야함 main옆에 해줘야 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //출력받기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력하기
        StringTokenizer st; //StringTokennizer를 사용하면 공백단위로 끊어서 데이터를 넣을 수 있음

        int t = Integer.parseInt(br.readLine());    //예외처리 안하면 오류남

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
            //nextToekn은 호출하는 거
            //String으로 받으니깐 형변환해주고
            //개행은 따로 해줘야함
        }
        bw.close();
    }
}



