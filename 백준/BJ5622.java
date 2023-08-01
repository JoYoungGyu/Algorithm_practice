package org.example;
import java.util.Scanner;

public class BJ5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int sum = 0;

        str = sc.next();
        String[] arr = str.split("");

        for(int i=0; i<arr.length; i++){
            int value = 0;
            switch (arr[i]){
                case "A": case "B" : case "C":
                    value = 3;
                    break;
                case "D": case "E" : case "F":
                    value = 4;
                    break;
                case "G": case "H" : case "I":
                    value = 5;
                    break;
                case "J": case "K" : case "L":
                    value = 6;
                    break;
                case "M": case "N" : case "O":
                    value = 7;
                    break;
                case "P": case "Q" : case "R": case "S":
                    value = 8;
                    break;
                case "T": case "U" : case "V":
                    value = 9;
                    break;
                case "W": case "X" : case "Y": case "Z":
                    value = 10;
                    break;
            }
            sum +=value;
        }

        System.out.println(sum);
    }
}
