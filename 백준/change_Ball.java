package org.example;
import java.util.Scanner;

public class change_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int temp_value = 0;
        int change_value1 , change_value2;
        n = sc.nextInt();
        int[] array = new int[n];

        m = sc.nextInt();
        for(int i = 0; i< array.length; i++){
            array[i] = i+1;
        }
        for(int j= 0; j<m; j++){
            change_value1 = sc.nextInt();
            change_value2 = sc.nextInt();
            temp_value = array[change_value1-1];
            array[change_value1-1] = array[change_value2-1];
            array[change_value2-1] = temp_value;
        }
        for(int k = 0 ; k < array.length; k++){
            System.out.print(array[k] + " ");
        }
    }
}