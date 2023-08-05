import java.util.*;
/*
* 백준
* 2439번
* 별 찍기-2
* */
public class BJ10988 {
    public static void main(String[] args) throws Exception{     //readLine을 사용할 때는 예외처리를 해줘야함 main옆에 해줘야 함
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);
        String revers_str = sb.reverse().toString();

        int answer = 0;

        if(str.equals(revers_str)){
            answer = 1;
        }

        System.out.println(answer);
    }
}



