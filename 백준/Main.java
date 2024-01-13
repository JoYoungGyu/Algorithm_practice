/*
    백준 10845 큐
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// 배열로 큐 만들기
public class Main{

    static int[] que = new int[10001];
    static int first = 0;
    static int last = 0;

    // push
    public static void push(int x){
        que[last] = x;
        last++;
    }

    // pop
    public static int pop(){
        if(last - first == 0){ //큐에 아무 데이터도 없을 때
            return -1;
        }else{
            int value = que[first];
            first++;
            return value;
        }
    }

    // size
    public static int size(){
        return last - first;
    }

    // empty
    public static int empty(){
        if(last - first == 0){
            return 1;
        }else{
            return 0;
        }
    }

    // front
    public static int front(){
        if(last-first == 0){
            return -1;
        }else{
            int value = que[first];
            return value;
        }
    }

    // back
    public static int back(){
        if(last-first == 0){
            return -1;
        }else{
            int value = que[last-1];
            return value;
        }
    }
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch(S){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    System.out.println(pop());
                    break;
                case "size" :
                    System.out.println(size());
                    break;
                case "empty" :
                    System.out.println(empty());
                    break;
                case "front" :
                    System.out.println(front());
                    break;
                case "back" :
                    System.out.println(back());
                    break;
            }
        }
    }
}'