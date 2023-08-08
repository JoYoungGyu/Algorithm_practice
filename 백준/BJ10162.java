import java.util.*;

public class BJ10162 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] times = { 300 , 60 , 10};
        int[] counts = new int[3];

        int food = sc.nextInt();
        if(food%10 != 0){
            System.out.println("-1");
        }else {
            for (int i = 0; i < times.length; i++) {
                counts[i] = food/times[i];
                food = food%times[i];
            }
            for(int j : counts){
                System.out.print(j+" ");
            }
        }
    }
}


