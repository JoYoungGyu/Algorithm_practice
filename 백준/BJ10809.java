package org.example;
import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str;
            int[] array = new int[26];

            for(int i=0; i<26; i++){
                array[i] = -1;
            }
            str = sc.nextLine();
            for(int j=0; j<str.length(); j++){
                if(array[(int)str.charAt(j)-97] == -1 ) {
                    array[(int) str.charAt(j) - 97] = j;
                }
            }

            for(int k=0; k<26; k++){
                System.out.print(array[k] + " ");
            }
    }
    }
