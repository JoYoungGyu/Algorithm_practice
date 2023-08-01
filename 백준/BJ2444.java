package org.example;
import java.util.Scanner;

public class BJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int n1 = n;
        int n2 = n;
        int count = 1;
        int count2 = 1;
        for(int i=0; i<n1-1; i++){
            for(int j=0; j<n-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<count; k++){
                System.out.print("*");
            }
            count +=2;
            System.out.println("");
            n--;
        }
        for(int m = 0; m<(2*n1-1); m++){
            System.out.print("*");
        }
        System.out.println("");
        for(int o=0; o<n1-1; o++){
            for(int p=0; p<count2; p++){
                System.out.print(" ");
            }
            for(int q=0; q<(2*((n1-count2)))-1; q++){
                System.out.print("*");
            }
            count2++;
            if(count != n1-1){
                System.out.println(" ");
            }
        }
    }
}
