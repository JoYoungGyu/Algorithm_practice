/*시간 초과나는 코드...*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 1;
        String n_len = Integer.toBinaryString(n);
        n_len = n_len.replaceAll("0","");
        int next_N = n;
        while(true){
            next_N = next_N + 1;
            String next_N_Len = Integer.toBinaryString(next_N);
            next_N_Len = next_N_Len.replaceAll("0","");
            if(n_len.length() == next_N_Len.length()){
                answer = next_N;
                break;
            }
            index++;
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
