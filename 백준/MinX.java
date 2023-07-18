package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class MinX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lists = new ArrayList<>();

        int n , addValue , minValue ;

        n = sc.nextInt();
        minValue = sc.nextInt();
        for (int i=0; i<n; i++){
            addValue = sc.nextInt();
            lists.add(addValue);
        }

        for(Integer list : lists){
            if(list < minValue){
                System.out.print(list+ " ");
            }
        }
    }
}