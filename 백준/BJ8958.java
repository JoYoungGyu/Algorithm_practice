import java.util.Scanner;
/*
* 백준 8958
* */



public class BJ8958 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i=0;i<n;i++){
            String str = sc.next();
            int sum = 0;
            count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 'O'){
                    count++;
                    sum +=count;
                }else{
                    count= 0;
                }
            }
            System.out.println(sum);
        }
    }
}
