package me.joyeonggyu;
import java.util.Scanner;
/*주석*/
public class Main{
    public static void main(String args[]){
        int[] arr = {1,2,3}; //조합을 만들 배열
        boolean[] visited = new boolean[arr.length];

        System.out.println("-----1. 백트레킹 구현 ------");

        for(int r=1; r <arr.length; r++){
            System.out.println("\n"+ arr.length + "중에" + r + "개 뽑음");
            comBacktracking(arr,visited,0,r);
        }

        System.out.println("-------2. 재귀함수로 구현--------");

        for(int r = 1; r<arr.length; r++){
            System.out.println("\n"+ arr.length + "중에" + r + "개 뽑음");
            comRecursive(arr,visited,0,r);
        }
    }

    /*
    * 백트래킹 구현
    * start 변수는 기준
    * start 기준으로 start 보다 작으면 뽑을 후보에서 제외한다.
    * start 보다 크면 뽑을 후보
    * EX) [1,2,3] 배열이고 start 0
    * 조합을 뽑는 밑에 함수에 들어오면 먼저 i정점부터 시작하는 for문 시작
    * 만약 0 인덱스에 있는 값 1을 뽑는다면 visited[i]는 true
    * 뽑지 않을 경우 visited[i] = false;
    * 즉 1을 고르면 뽑을 경우(true), 뽑지 않을 경우(false) 둘 다 고려
    * 하지만 더 이상 1은 고려대상이 아니기에 다음 for문은 2부터 시작
    * */
    public static void comBacktracking(int[] arr, boolean[] visited, int start, int r){
        if(r==0){
            print(arr,visited);
            return;
        }else{
            for(int i = start; i<arr.length; i++){
                visited[i] = true;
                comBacktracking(arr,visited, i+1, r-1);
                visited[i] = false;
            }
        }
    };
    /*
    * 재귀함수 이용
    * depth 변수는 현재 인덱스 0부터시작
    * 현재 인덱스를 뽑으면 true 뽑지 않으면 false
    * 백트래킹과 마찬가지로 뽑은 경우, 뽑지 않은 경우 둘다 봐야함
    * 이전에 값들은 이미 본 것들이라 상관X => depth +1
    * depth == n 이 되면 모든 인덱스를 다 봄 (배열의 끝 도착 => 조합 만들수 X) 재귀 종료
    * 또한 r == 0이 되면 뽑을 갯수 끝 조합 완성
    * */
    public static void comRecursive(int[] arr, boolean[] visited, int depth,  int r){
        if(r==0){
            print(arr,visited);
            return;
        }
        if(depth == arr.length){
            return;
        }else{
            visited[depth] = true;
            comRecursive(arr , visited, depth+1, r-1);

            visited[depth] = false;
            comRecursive(arr, visited, depth+1, r);
        }
    }

    static void print(int[] arr, boolean[] visited){
        for(int i=0; i < arr.length; i++){
            if(visited[i] == true){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}