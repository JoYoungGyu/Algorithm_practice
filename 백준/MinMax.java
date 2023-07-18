package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lists = new ArrayList<>();

        int n , addValue;
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            addValue = sc.nextInt();
            lists.add(addValue);
        }

        Collections.sort(lists);
        System.out.print(lists.get(0)+" "+lists.get(lists.size()-1));
    }
}