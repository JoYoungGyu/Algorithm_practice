import java.util.*;

public class BJ2738 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int k=0; k<2; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int value = sc.nextInt();
                    matrix[i][j] += value;
                }
            }
        }
        for(int l = 0; l <n; l++){
            for(int o = 0; o <m; o++){
                System.out.print(matrix[l][o] + " ");
            }
            System.out.println("");
        }
    }
}


