import java.util.*;
/*
* 백준
* 25314번
* 코딩은 체육과목입니다.
* */
public class Long_TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; //문제의 정수
        int i_n;    //루프 인덱스

        n = sc.nextInt();
        i_n = n/4;
        for(int i=0; i<i_n; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}



