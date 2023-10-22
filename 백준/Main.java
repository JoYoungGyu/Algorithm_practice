package me.joyeonggyu;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        int num = 665;
        while(true){
            int temp_Num = num;
            int score = 0;
            boolean chk = false;
            while(temp_Num>0){
                int temp_Num_Mod = temp_Num%10;
                if(temp_Num_Mod==6){
                    chk=true;
                    score++;
                    if(score > 2 && chk == true){
                        count++;
                        break;
                    }
                }else{
                    chk=false;
                    score = 0;
                }
                temp_Num = temp_Num/10;
            }

            num++;

            if(n == count){
                break;
            }
        }
        System.out.println(num-1);
    }
}