import java.util.*;

public class BJ2566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] check_board = new int[9][9];
        int max = 0;
        int index = 0;
        int index2 = 0;
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                int value = sc.nextInt();
                if(max <= value){
                    max = value;
                    index = i;
                    index2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.print(index + " " + index2);
    }
}


