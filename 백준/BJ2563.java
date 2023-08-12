import java.util.*;

public class BJ2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int[][] check_board = new int[100][100];
        for(int i =0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x; j<x+10; j++){
                for(int k = y; k<y+10; k++){
                    check_board[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(check_board[i][j] == 1){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}


