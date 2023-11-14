package me.joyeonggyu;
import java.util.Scanner;
/*주석*/
public class Main{
    public static void main (String args[]) {
        System.out.println(Com(10,2));
    }

    public static int Com(int n, int r){
        if(n==r || r==0){
            return 1;
        }else{
            return Com(n-1,r-1) + Com(n-1,r);
        }
    }
}