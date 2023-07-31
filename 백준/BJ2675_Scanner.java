package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class BJ2675_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array_str = new ArrayList<>();
        int n, repeat;
        String str;
        String sum_String = "";

        n = sc.nextInt();

        for(int i=0; i<n; i++){
            sum_String ="";
            repeat = sc.nextInt();
            str = sc.next();
            for(int j=0; j< str.length(); j++){
                for(int k=0; k<repeat; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
