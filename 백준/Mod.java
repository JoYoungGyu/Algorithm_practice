package org.example;
import java.util.Scanner;
import java.util.HashSet;


public class Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> array = new HashSet<>();

        for(int i=0 ; i < 10; i++){
            int mod_value = sc.nextInt();
            array.add(mod_value%42);
        }
        System.out.println(array.size());
    }
}