package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> hashSet = new HashSet<String>();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            hashSet.add(br.readLine());
        }
        String[] arrStr = new String[hashSet.size()];

        int count= 0;
        for(String i : hashSet){
            arrStr[count] = i;
            count++;
        }
        Arrays.sort(arrStr);
        Arrays.sort(arrStr, (String s1, String s2) -> s1.length() - s2.length());
        //Arrays.sort(arrStr, Comparator.comparing(String::length));
        for(String i : arrStr){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}