package me.joyeonggyu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;


public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

      //  String binaryVal = Integer.toBinaryString(n);
      //  bw.write(binaryVal);
        bw.write(String.valueOf(Integer.bitCount(n)));
        bw.flush();
        bw.close();
    }
}