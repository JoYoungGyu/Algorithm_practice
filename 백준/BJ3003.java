package org.example;
import java.util.Scanner;

public class BJ3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] white = {1,1,2,2,2,8};
        String[] black = sc.nextLine().split(" ");
        int[] chess = new int[6];

        for(int i=0; i<6; i++){
            chess[i] = white[i] - Integer.parseInt(black[i]);
        }

        for(int j : chess){
            System.out.print(j + " ");
        }
    }
}
