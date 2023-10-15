package me.joyeonggyu;

public class Main{
    public static int fin(int num){
        int answer = 0;
        if(num < 2){
            answer = num;
        }else{
            answer = fin(num-1) + fin(num-2);
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println("Fibonacci numbers : " + fin(5));
    }
}
