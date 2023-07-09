import java.util.Scanner;
/*
* 백준
* 25304
* 영수증
* */
public class RECIPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price_x , price_y=0; // x : 영수증 가격 y : 계산한 가격
        int n;  //루프 도는 수
        int a, b ;// 물건 갯수와 가격

        price_x = sc.nextInt();
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            price_y+=a*b;
        }
        if(price_x == price_y) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}



