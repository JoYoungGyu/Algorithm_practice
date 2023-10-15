# 피보나치 수
class Solution {
    public int solution(int n) {
        int answer = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i=2; i<n+1; i++){
            n3 = (n1 + n2)%1234567;
            n1 = n2;
            n2 = n3;
        }
        return answer = n3%1234567;
    }
}