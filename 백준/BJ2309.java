import java.util.*;
/*
 * 백준 2309번
 * */

public class BJ2309 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            int a = sc.nextInt();
            sum += a;
            array[i] = a;
        }
        int min=0, max=0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(100 == sum - (array[i] + array[j])){
                    min = array[i];
                    max = array[j];
                    break;
                }
            if(sum == 100){
                break;
            }
            }
        }
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(array[i] != min && array[i] != max){
                System.out.println(array[i]);
            }
        }
    }
}