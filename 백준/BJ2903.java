import java.util.*;

public class BJ2903 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n_pow = (int) Math.pow(2,n)+1;

        int value = (n_pow*n_pow);

        System.out.println(value);

    }
}


