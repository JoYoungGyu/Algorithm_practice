import java.util.Scanner;
import java.util.ArrayList;

public class BJ2501 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> array = new ArrayList<>();
            int n = sc.nextInt();
            int k = sc.nextInt();

            for(int i=1; i<n+1; i++){
                if(n%i==0){
                    array.add(i);
                }
            }

            if(array.size() < k) {
                System.out.println("0");
            }else{
                System.out.println(array.get(k-1));
            }
        }
    }



