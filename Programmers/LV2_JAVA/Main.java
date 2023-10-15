/*시간 초과나는 코드...*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_Cnt = Integer.bitCount(n);
        int next_Cnt = 0;
        while(true){
            n = n+1;
            next_Cnt = Integer.bitCount(n);
            if(n_Cnt == next_Cnt){
                answer = n;
                break;
            }
        }
        return answer;
    }
}

/*bitCount 메서드 이용*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_Cnt = Integer.bitCount(n);
        int next_Cnt = 0;
        while(true){
            n = n+1;
            next_Cnt = Integer.bitCount(n);
            if(n_Cnt == next_Cnt){
                answer = n;
                break;
            }
        }
        return answer;
    }
}