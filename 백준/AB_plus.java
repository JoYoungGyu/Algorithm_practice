import java.util.Scanner;
/*
* 백준
* 10950번
* */
public class AB_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t; // 테스트 갯수
        int num1, num2;  // 입력값들
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println(num1 + num2);
        }
    }
}



