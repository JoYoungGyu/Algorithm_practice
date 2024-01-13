/*
백준 1920 수찾기
이분탐색, BinarySearch함수 사용
*/


/*이분 탐색*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static int[] intA;

    public static int binarySer(int key){
        int lowIdx = 0;
        int highIdx = intA.length-1;

        while(lowIdx <= highIdx){
            int midIdx = (lowIdx + highIdx)/2;

            if(key < intA[midIdx]){
                highIdx = midIdx -1;
            }else if(key > intA[midIdx]){
                lowIdx = midIdx + 1;
            }else{
                return midIdx;
            }
        }
        return -1;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nA = Integer.parseInt(br.readLine());
        intA = new int[nA];
        StringTokenizer stA = new StringTokenizer(br.readLine());

        for(int i=0; i<nA; i++){
            intA[i] = Integer.parseInt(stA.nextToken());
        }

        Arrays.sort(intA);

        int nB = Integer.parseInt(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for(int i=0; i<nB; i++){
            if(binarySer(Integer.parseInt(stB.nextToken())) >= 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}

/*Arrays.binarySearch*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{

    public static int[] intA;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nA = Integer.parseInt(br.readLine());
        intA = new int[nA];
        StringTokenizer stA = new StringTokenizer(br.readLine());

        for(int i=0; i<nA; i++){
            intA[i] = Integer.parseInt(stA.nextToken());
        }

        Arrays.sort(intA);

        int nB = Integer.parseInt(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for(int i=0; i<nB; i++){
            if(Arrays.binarySearch(intA ,Integer.parseInt(stB.nextToken())) >= 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
