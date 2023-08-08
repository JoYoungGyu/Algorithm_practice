import java.util.*;

public class BJ11034 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = Math.max((b-a),(c-b));
            System.out.println(max -1);
        }
    }
}


