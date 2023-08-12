import java.util.*;

public class BJ11005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt(); //변환 할 숫자
        int n = sc.nextInt();   //진법
        ArrayList<Integer> array = new ArrayList<>();

        while(value > 0){
            array.add(value%n);
            value = value/n;
        }


        for(int i=array.size()-1; i>-1; i--){
            if(-1< array.get(i) && array.get(i) <10){

                System.out.print((char)(array.get(i)+'0'));
            }else{

                System.out.print((char)((array.get(i)-10)+'A'));
            }
        }

    }
}


