class Solution {
    public int solution(int chicken) {
        int answer = -1;
        if(chicken > 9){
            chicken = chicken-10;
            answer = 1;
            answer += chicken/9;
        }else answer = 0;
        return answer;
    }
}
