/*
* 백준 10816 숫자카드2
* 이중 for문, 이분검색, 해쉬맵, Counting기법
* */

/*이중 for문*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] wordN = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] wordM = br.readLine().split(" ");

        for(int i=0; i< wordM.length; i++){
            int count = 0;
            for(int j=0; j<wordN.length; j++){
                if(wordM[i].equals(wordN[j])){
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}

/*이분검색*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static int getLowCount(int[] arr, int x){
        int lower = 0;
        int high = arr.length;

        while(lower < high){
            int mid = (lower + high) / 2; //중간위치
            if(x <= arr[mid]){
                high = mid;
            }else{
                lower = mid+1;
            }
        }
        return lower;
    }

    public static int getHighCount(int[] arr, int x){
        int lower = 0;
        int high = arr.length;
        while(lower < high){
            int mid = (lower + high) / 2;
            if(arr[mid] > x){
                high = mid;
            }else{
                lower = mid+1;
            }
        }
        return lower;
    }
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wordN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n; i++){
            wordN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wordN);
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int x = Integer.parseInt(stM.nextToken());
            sb.append(getHighCount(wordN, x) - getLowCount(wordN, x)).append(' ');

        }
        System.out.println(sb);
    }
}

/*자료구조 : 해시맵*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        HashMap<key, value>
        key = 입력되는 원소
        value = 원소의 개수(=중복 입력된 원소의 수)
        */
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int wordN[] = new int[n];
        for(int i=0; i<n; i++){
            int key = Integer.parseInt(st.nextToken());
            map.put(key , map.getOrDefault(key,0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(key,0)).append(' ');
        }
        System.out.println(sb);
    }
}
/*Counting기법*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static int[] countArr = new int[20000001];
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++){
            int idx = Integer.parseInt(st.nextToken());
            countArr[idx+10000000]++;
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++){
            int arrIdx = Integer.parseInt(st.nextToken());
            sb.append(countArr[arrIdx+10000000]).append(' ');
        }
        System.out.println(sb);
    }
}
