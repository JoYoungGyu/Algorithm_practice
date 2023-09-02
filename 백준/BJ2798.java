import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * 백준 2798번
 * */



public class BJ2798 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int n , m ;
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            array.add(a);
        }

        for(int i = array.size()-1; i>-1; i--) {
            for(int j= i-1; j>-1; j--){
                for(int k = j-1; k>-1; k--){
                    int sum = array.get(i) + array.get(j) + array.get(k);
                    if(sum <= m){
                        array2.add(sum);
                    }
                }
            }
        }

        Collections.sort(array2, Collections.reverseOrder());
        System.out.println(array2.get(0));
    }
}