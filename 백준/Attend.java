package org.example;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Attend {
    public static void main(String[] args) {
        int count = 0;
        int attend;

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sort_array = new ArrayList<>();

        int[] array = new int[31];
        array[0] = 1;
        for(int i = 0 ; i<28; i++){
            attend = sc.nextInt();
            array[attend] = 1;
        }
        for(int j = 0; j< array.length; j++){
            if(array[j] == 0) {
                sort_array.add(j);
            }
        }
        Collections.sort(sort_array);

        System.out.println(sort_array.get(0));
        System.out.println(sort_array.get(1));
    }
}