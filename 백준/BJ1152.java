package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int count = str.length;
        if(count != 0){
            if(str[0] == ""){
                count--;
            }
        }

            System.out.println(count);

    }
}
