import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> coin = new Stack<>();

        for(int i=0; i<n; i++){
            int value = Integer.parseInt(br.readLine());
            if( !coin.isEmpty() && value == 0){
                coin.pop();
            }else{
                coin.push(value);
            }
        }

        while(!coin.isEmpty()){
            sum += coin.pop();
        }

        System.out.println(sum);
        bw.flush();
        bw.close();
    }
}
