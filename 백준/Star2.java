import java.util.Scanner;
/*
* 백준
* 2439번
* 별 찍기-2
* */
public class Star2 {
    public static void main(String[] args) throws Exception{     //readLine을 사용할 때는 예외처리를 해줘야함 main옆에 해줘야 함
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int n1 = n;
        for(int i=1;i<n1+1;i++){
            for(int j=0; j<n-1;j++){
                System.out.print(" ");
            }
            for(int k=0; k<i;k++){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}



