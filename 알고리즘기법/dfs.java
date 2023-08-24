import java.util.*;
/*
* 방문 기준 번호가 낮은 인접노드부터
* 무방향 그래프
* 순서 1 -> 2 -> 7 -> 6 -> 8 -> 3 -> 4 -> 5
* */
public class dfs {
    // 9개 노드 방문체크하는 배열
    public static boolean[] visited = new boolean[9];
    //무방향 그래프 노드 9개
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int x){
        visited[x] = true;
        System.out.print(x + " ");
        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y]){
                dfs(y);
            }
        }
    }

    public static void main(String[] args){
        //그래프 초기화 시키기
        for(int i=0; i<9; i++){
                graph.add(new ArrayList<Integer>());
            }
            //1번 노드 생성
            graph.get(1).add(2);
            graph.get(1).add(3);
            graph.get(1).add(7);

            //2번 노드
            graph.get(2).add(1);
            graph.get(2).add(7);

            //3번 노드
            graph.get(3).add(1);
            graph.get(3).add(4);
            graph.get(3).add(5);

            //4번 노드
            graph.get(4).add(3);
            graph.get(4).add(5);

            //5번 노드
            graph.get(5).add(3);
            graph.get(5).add(4);

            //6번 노드
            graph.get(6).add(7);

            //7번 노드
            graph.get(7).add(2);
            graph.get(7).add(6);
            graph.get(7).add(8);

            //8번 노드
            graph.get(8).add(1);
            graph.get(8).add(7);

            dfs(1);
        }
    }



