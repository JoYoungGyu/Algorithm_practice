package org.example;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        String re_str1, re_str2;
        int a , b , max;

        StringBuffer sb = new StringBuffer(str[0]);
        re_str1 = sb.reverse().toString();
        a = Integer.parseInt(re_str1);

        StringBuffer sb2 = new StringBuffer(str[1]);
        re_str2 = sb2.reverse().toString();
        b = Integer.parseInt(re_str2);

        if(a > b){
            max = a;
        }else max = b;

        System.out.println(max);

    }
}
