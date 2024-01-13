/*
* 백준 10866 덱
* 배열로 구현 , 자바에서 구현된 자료구조 사용
* */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


/*덱 직접 구현*/
public class Main{
    static int[] deq = new int[20001];
    static int front = 10000;
    static int back = 10000;
    static int size = 0;

    public static void addFront(int x){
        deq[front] = x;
        front--;
        size++;
    }

    public static void addback(int x){
        back++;
        deq[back] = x;
        size++;
    }

    public static int popFront(){
        if(size == 0 ){
            return -1;
        }
        int value = deq[front+1];
        front++;
        size--;
        return value;
    }

    public static int popBack(){
        if(size == 0){
            return -1;
        }
        int value = deq[back];
        back--;
        size--;
        return value;
    }

    public static int valFront(){
        if(size == 0){
            return -1;
        }
        return deq[front+1];
    }

    public static int valBack(){
        if(size == 0){
            return -1;
        }
        return deq[back];
    }

    public static int getSize(){
        return size;
    }

    public static int getEmpty(){
        if(size == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i< n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            switch(S){
                case "push_front" :
                    addFront(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    addback(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    System.out.println(popFront());
                    break;
                case "pop_back" :
                    System.out.println(popBack());
                    break;
                case "front" :
                    System.out.println(valFront());
                    break;
                case "back" :
                    System.out.println(valBack());
                    break;
                case "size" :
                    System.out.println(getSize());
                    break;
                case "empty" :
                    System.out.println(getEmpty());
                    break;
            }
        }
    }
}

/*자바 자료구조 이용*/
import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.OutputStreamWriter;
        import java.util.ArrayDeque;
        import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dque = new ArrayDeque<Integer>();

        for(int i = 0; i< n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch(S){
                case "push_front" :
                    dque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    dque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    if(dque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(dque.pollFirst());
                    }
                    break;
                case "pop_back" :
                    if(dque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(dque.pollLast());
                    }
                    break;
                case "size" :
                    System.out.println(dque.size());
                    break;
                case "empty" :
                    if(dque.isEmpty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;
                case "front" :
                    if(dque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(dque.peekFirst());
                    }
                    break;
                case "back" :
                    if(dque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(dque.peekLast());
                    }
                    break;
            }
        }
    }
}