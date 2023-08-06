import java.util.Scanner;

public class BJ2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] coin = {25 , 10 ,5 ,1};
        for(int i = 0; i< n; i++){
            int[] count = {0 ,0 , 0 ,0};

            int change = sc.nextInt();
            for(int j=0; j<count.length; j++){
                count[j] = change/coin[j];
                change = change%coin[j];
            }
            System.out.println(count[0] +" "+count[1] +" "+ count[2]+" "+count[3]);
        }
    }
}


