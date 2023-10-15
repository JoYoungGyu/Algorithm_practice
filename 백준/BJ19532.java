package me.joyeonggyu;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*정답 : 완전탐색으로 구현*/
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for(int i=-999; i<1000;i++){
            for(int j=-999; j<1000; j++){
                if( a*i + b*j == c && d*i + e*j == f){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
/*
구현하다가 틀림
* 
public class Main{
    public static int GCD(int num1 , int num2){
        if(num1%num2 == 0){
            return num2;
        }
        return GCD(num2, num1%num2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int a_b_GDC = GCD(Math.max(a,d),Math.min(a,d));
        int GCD_Num = (a*d)/(a_b_GDC !=0 ? a_b_GDC : 1);
        int mul_Count1 = 1;
        int mul_Count2 = 1;
        int y = 0;
        int y_value = 0;
        int x = 0;
        int x_value = 0;
        if(GCD_Num > a){
            mul_Count1 = GCD_Num/a;
        }
        if(GCD_Num > b){
            mul_Count2 = GCD_Num/b;
        }

        if(mul_Count1 == 0){
            mul_Count1 = 1;
        }
        if(mul_Count2 == 0){
            mul_Count2 = 1;
        }

        a=a*mul_Count1;
        b=b*mul_Count1;
        c=c*mul_Count1;
        d=d*mul_Count2;
        e=e*mul_Count2;
        f=f*mul_Count2;

        if(a==d){
            y = b-e;
            y_value = c - f;
        }else{
            y = b+e;
            y_value =  c + f;
        }
        if(y==0){
            y=1;
        }
        if(y_value==0){
            y_value=1;
        }
        y_value = y_value/y;

        a=a/mul_Count1;
        b=b/mul_Count1;
        c=c/mul_Count1;
        d=d/mul_Count2;
        e=e/mul_Count2;
        f=f/mul_Count2;

        int b_e_GDC = GCD(Math.max(b,e),Math.min(b,e));
        int GCD_Num2 = (b*e)/(b_e_GDC !=0 ? b_e_GDC : 1);
        int mul_Count3 = 1;
        int mul_Count4 = 1;

        if(GCD_Num > b){
            mul_Count3 = GCD_Num2/b;
        }
        if(GCD_Num > e){
            mul_Count3 = GCD_Num2/e;
        }

        if(mul_Count3 == 0){
            mul_Count3 = 1;
        }
        if(mul_Count4 == 0){
            mul_Count4 = 1;
        }

        a=a*mul_Count3;
        b=b*mul_Count3;
        c=c*mul_Count3;
        d=d*mul_Count4;
        e=e*mul_Count4;
        f=f*mul_Count4;

        if(b==e){
            x = a-d;
            x_value = c - f;
        }else{
            x = a+d;
            x_value =  c + f;
        }
        if(x==0){
            x=1;
        }
        if(x_value==0){
            x_value=1;
        }
        x_value = x_value/x;

        System.out.println(x_value+ " " + y_value);
* */
