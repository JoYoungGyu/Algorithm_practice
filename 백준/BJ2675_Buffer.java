package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BJ2675_Buffer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i< n; i++){
            String[] str = br.readLine().split(" ");

            int repeat = Integer.parseInt(str[0]);
            String s = str[1];

            for(int j=0; j<s.length(); j++){
                for(int k=0; k<repeat; k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
