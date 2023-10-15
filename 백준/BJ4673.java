package me.joyeonggyu;

public class Main{
    public static void main(String[] args){
        System.out.println("1");
        for(int i=2; i<10001; i++){
            int check = 1;
            for(int j=1; j<i; j++) {
                int temp_j = j;
                int sum = temp_j;
                while (temp_j > 0) {
                    sum += temp_j % 10;
                    temp_j = temp_j / 10;
                }
                if (sum == i){
                    check = 0;
                    break;
                }
            }
        if(check == 1){
            System.out.println(i);
        }
        }
    }
}
