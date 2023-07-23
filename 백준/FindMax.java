package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> sort_array = new ArrayList<>();

        for(int i=0; i<9; i++){
            int value = sc.nextInt();
            array.add(value);
            sort_array.add(value);
        }
        Collections.sort(sort_array);
        int Max_value = sort_array.get(sort_array.size()-1);
        int Max_value_index = 0;
        for(int j=0; j<array.size(); j++){
            if(array.get(j) == Max_value){
                Max_value_index = j+1;
            }
        }
        System.out.println(Max_value);
        System.out.println(Max_value_index);
    }
}