package me.joyeonggyu;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i=1; i<n+1; i++){
            int sum = i;
            int tmep_i = i;
            while(tmep_i>0){
                sum += tmep_i%10;
                tmep_i = tmep_i/10;
            }
            if(sum == n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
