package me.joyeonggyu;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
    public static String[] getPolyMo(String[] str){
        String[] polyMo = str;
        for(int i=0; i<str.length; i++){
            if(str[i].length()%4==0){
                str[i] = str[i].replaceAll("X","A");
            }else if(str[i].length() >= 6 && str[i].length()%2 == 0){
                str[i] = str[i].replaceAll("X","A").substring(0,str[i].length()-2);
                str[i] = str[i] + "BB";
            }else if(str[i].length()%2 == 0){
                str[i] = str[i].replaceAll("X","B");
            }
        }
        return polyMo;
    }

    public static String getResult(String[] str){
        String result = "";
        for(int i=0; i<str.length; i++){
            result = result + str[i];
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(".");
        String[] polyMoStr = getPolyMo(str);
        String result = getResult(polyMoStr);
        bw.write(Arrays.toString(str));
        bw.write(Arrays.toString(polyMoStr));
        bw.write(result);
        bw.flush();
        bw.close();
    }
}