package org.example;

public class LV0_문자열계산하기 {
    public int solution(int n) {
        int answer = 0;

        while (n>0){
            answer += n%10;
            n = n/10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}