/*
 백준 1026 보물
 JAVA
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        ArrayList<Integer> b = new ArrayList<>();
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(stA.nextToken());
            b.add(Integer.parseInt(stB.nextToken()));
        }

        Arrays.sort(a);
        int answer = 0;


        for(int i=0; i<n; i++){
            int max = Collections.max(b);
            answer += (max * a[i]);
            b.remove(Integer.valueOf(max));
        }

        System.out.println(answer);
    }
}