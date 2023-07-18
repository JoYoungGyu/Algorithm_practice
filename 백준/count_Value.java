package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class count_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lists = new ArrayList<>();

        int n , addValue;
        int count = 0;
        int checkValue;
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            addValue = sc.nextInt();
            lists.add(addValue);
        }

        checkValue = sc.nextInt();

        for(Integer list: lists ){
            if(list == checkValue){
                count++;
            }
        }
        System.out.println(count);
    }
}