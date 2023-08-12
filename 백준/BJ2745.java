import java.util.*;

public class BJ2745 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); //변환 할 숫자
        int n = sc.nextInt();   //진법
        int tmp = 1; //진법 곱으로 가는 숫자
        int sum = 0; // 결과값

        //이거 잘봐야함 진법 변환이니깐 뒤에서부터 ^1시작임
        for(int i =str.length()-1; i>-1; i--){
            char c = str.charAt(i);
            //0~9는 그대로 *n
            if('0' <= c && c <= '9'){
                sum += (c - '0') * tmp;
            }else{ // 다른 문자들은 +10을 해줘야함
                sum += ((c-'A')+10) *tmp;
            }
            tmp *=n;    //진법 * 해주는 코드
        }
        System.out.println(sum);
    }
}


