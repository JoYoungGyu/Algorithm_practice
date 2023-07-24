package org.example;
import java.util.Scanner;

public class Insert_ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;

        n = sc.nextInt();
        m = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<m; i++){
            int f_basket = sc.nextInt();
            int s_basket = sc.nextInt();
            int value = sc.nextInt();
            for(int j=f_basket-1; j<s_basket; j++){
                    array[j] = value;
            }
        }
        for(int k=0; k< array.length; k++){
            System.out.print(array[k] + " ");
        }
    }
}