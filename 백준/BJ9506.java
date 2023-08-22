import java.util.Scanner;
import java.util.ArrayList;

public class BJ9506 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            while(true){
                int n = sc.nextInt();
                if(n == -1){
                    break;
                }
                ArrayList<Integer> array = new ArrayList<>();
                for(int i=1; i<n; i++){
                    if(n%i==0){
                        array.add(i);
                    }
                }
                int sum = 0;
                for(int j=0; j<array.size(); j++){
                    sum +=array.get(j);
                }
                if(n == sum){
                    System.out.print(n+" = ");
                    for(int k=0; k<array.size()-1; k++){
                        System.out.print(array.get(k)+" + ");
                    }
                    System.out.println(array.get(array.size()-1));
                }else{
                    System.out.println(n+" is NOT perfect.");
                }
            }
        }
    }



