package me.joyeonggyu;

public class Main{
    public static int fin(int num){
        int answer = 0;
        if(num < 2){
            answer = num;
        }else{
            int n1 = 0;
            int n2 = 1;
            int n3 = 0;
            for(int i=2 ; i< num+1; i++){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            answer = n3;
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println("Fibonacci numbers : " + fin(5));
    }
}