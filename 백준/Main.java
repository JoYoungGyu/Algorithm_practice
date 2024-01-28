import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static boolean[] computers;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static int count = 0;

    public static void getDfs(int x){
        computers[x] = true;
        count++;
        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!computers[y]){
                getDfs(y);
            }
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        computers = new boolean[n];
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        };
        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        };
        getDfs(0); //1번컴퓨터는 이미 감염되어있기 때문에
        System.out.println(count-1);
    }
}