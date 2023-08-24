import java.util.*;
/* 나동나 알고리즘 - 유튜브 강의문제
* DFS 너비우선탐색 기초문제
* 아이스크림 얼려먹기
* */
public class dfs_1 {
    public static int n,m;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문

    public static boolean dfs(int x, int y){
        if(x<0 || x>n-1 || y<0 || y>m-1){
            return false;
        }
        if(graph[x][y] == 0){
            graph[x][y] =1;

            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dfs(i,j)){
                    result ++;
                }
            }
        }
        System.out.print(result);
    }
}



/*입력값
4
5
00110
00011
11111
00000
출력 : 3
*/
