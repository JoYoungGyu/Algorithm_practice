package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Array_avg {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            double value = sc.nextDouble();
            array.add(value);
        }
        Collections.sort(array);

        int length = array.size();
        double mod_value = array.get(length-1);
        double avg = 0;
        for(int j=0; j<array.size()-1; j++){
           avg += (array.get(j)/mod_value)*100;
        }
        System.out.println((avg+100.0)/length);
    }
}