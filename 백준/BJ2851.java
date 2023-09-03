import java.util.*;
/*
 * 백준 2851번
 * 슈퍼마리오
 * */

public class BJ2851 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        ArrayList<Integer> sum = new ArrayList<>();
        int total = 0;
        int answer = 0;
        for(int i=0; i<10;i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(total <= 100){
                total+=numbers[i];
                sum.add(total);
            }
        }
        int a = 100 - sum.get(sum.size()-2);
        int b = 100 - sum.get(sum.size()-1);
        if(sum.size() == 1){
            System.out.println(sum.get(0));
        }else {
            if (Math.abs(a) < Math.abs(b)) {
                System.out.println(sum.get(sum.size() - 2));
            } else {
                System.out.println(sum.get(sum.size() - 1));
            }
        }
    }
}