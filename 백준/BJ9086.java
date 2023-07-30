package org.example;
import java.util.Scanner;

public class BJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String str;

        n = sc.nextInt();
        str = sc.nextLine();
        for(int i=0; i<n; i++) {
            str = sc.nextLine();
            int length = str.length();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(length-1));
            System.out.println("");
        }
    }
}