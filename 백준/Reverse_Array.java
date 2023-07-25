package org.example;
import java.util.Scanner;
import java.util.ArrayList;


public class Reverse_Array {
    public static void reverseArray(ArrayList<Integer> a, int start , int end){
        while(start < end) {
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);

            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n,m;
        int a,b;
        n = sc.nextInt();
        for(int i =1; i<n+1; i++){
            array.add(i);
        }
        m = sc.nextInt();

        for(int j=0; j<m; j++) {

            a = sc.nextInt();
            b = sc.nextInt();
            reverseArray(array, a-1, b-1);
        }
        for(int k=0; k<array.size(); k++){
            System.out.print(array.get(k)+" ");
        }
    }
}