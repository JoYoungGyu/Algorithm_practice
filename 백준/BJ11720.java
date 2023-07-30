package org.example;
import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        String str;

        n = sc.nextInt();
        str = sc.nextLine();
        str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                sum += Character.getNumericValue(str.charAt(i));
            }
            System.out.println(sum);
        }
    }